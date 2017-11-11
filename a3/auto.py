import random

def instance(classname,src):
    name=src+classname[-4:]
    f.write("//class instance creation\n")
    f.write(classname+" "+name+" = null;\n")
    f.write("try {\n")
    f.write(name+" = new "+classname+"("+src+");\n")
    f.write("} catch (WrongLength e) {\n")
    f.write("System.out.println(e.FormatError());\n")
    f.write("}\n")

#open the file
f = open('auto.txt','w')

classname = ["Matrix3x3flat","Matrix3x3rc","Matrix3x3cr","MatrixArrayFlat","MatrixArrayRC","MatrixArrayCR"]
src=['m01', 'm02', 'm03', 'm04', 'm05', 'm06', 'm07', 'm08', 'm09','m10']

names=[]
for i in range(6):
    for j in range(10):
        instance(classname[i],src[j])
        names.append(src[j]+classname[i][-4:])

        
#close the file
f.close()
