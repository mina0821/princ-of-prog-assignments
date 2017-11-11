
def calculate(classname,src,i):
    name=src+classname[-4:]
    if i==-1:
        ans="ans"+name+"neg1"
    else:
        ans="ans"+name+str(i)
    f.write("//matrixpower(i)\n")
    f.write(classname+" "+ans+" = new "+classname+"();\n")
    f.write("try {\n")
    f.write(ans+" = "+name+".matrixpower("+str(i)+");\n")
    f.write("} catch (WrongPower e) {\n")
    f.write('System.out.println(e.FormatError());\n')
    f.write('} catch (WrongLength e) {\n')
    f.write('System.out.println(e.FormatError());\n')
    f.write('}\n')
    
f=open("test1.txt","w")
classname = ["Matrix3x3flat","Matrix3x3rc","Matrix3x3cr","MatrixArrayFlat","MatrixArrayRC","MatrixArrayCR"]
src=['m01', 'm02', 'm03', 'm04', 'm05', 'm06', 'm07', 'm08', 'm09','m10']

for i in range(-1,4):
    for j in range(10):
        for k in range(6):
            name=src[j]+classname[k][-4:]
            if i==-1:
                ans="ans"+name+"neg1"
            else:
                ans="ans"+name+str(i)
            calculate(classname[k],src[j],i)
            f.write("content["+str(i+1)+"]["+str(j)+"]="+ans+".toArray());\n")


f.close()
