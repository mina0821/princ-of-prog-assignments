

f=open("test2.txt","w")
classname = ["Matrix3x3flat","Matrix3x3rc","Matrix3x3cr","MatrixArrayFlat","MatrixArrayRC","MatrixArrayCR"]
src=['m01', 'm02', 'm03', 'm04', 'm05', 'm06', 'm07', 'm08', 'm09','m10']

for c1 in range(6):
    for c2 in range(6):
        for s in range(10):
            for i in range(-1,4):
                    if i==-1:
                        a="a"+str(c1)+str(c2)+str(s)+"neg1"
                        b="b"+str(c1)+str(c2)+str(s)+"neg1"
                        c="c"+str(c1)+str(c2)+str(s)+"neg1"
                        d="d"+str(c1)+str(c2)+str(s)+"neg1"
                    else:
                        a="a"+str(c1)+str(c2)+str(s)+str(i)
                        b="b"+str(c1)+str(c2)+str(s)+str(i)
                        c="c"+str(c1)+str(c2)+str(s)+str(i)
                        d="d"+str(c1)+str(c2)+str(s)+str(i)
                    f.write("//check c.toArray() = d.toArray()\n")
                    f.write(classname[c1]+" "+a+" = new "+classname[c1]+"();\n")
                    f.write(classname[c1]+" "+c+" = new "+classname[c1]+"();\n")
                    f.write(classname[c2]+" "+b+" = new "+classname[c2]+"();\n")
                    f.write(classname[c2]+" "+d+" = new "+classname[c2]+"();\n")
    
                    f.write("try {\n")
                    f.write(a+" = new "+classname[c1]+"("+src[s]+");\n")
                    f.write("} catch (WrongLength e) {\n")
                    f.write("System.out.println(e.FormatError());\n")
                    f.write("}\n")
                    
                    f.write("try {\n")
                    f.write(b+" = new "+classname[c2]+"("+src[s]+");\n")
                    f.write("} catch (WrongLength e) {\n")
                    f.write("System.out.println(e.FormatError());\n")
                    f.write("}\n")
    
                    f.write("try {\n")
                    f.write(c+" = "+a+".matrixpower("+str(i)+");\n")
                    f.write("} catch (WrongPower e) {\n")
                    f.write('System.out.println(e.FormatError());\n')
                    f.write('} catch (WrongLength e) {\n')
                    f.write('System.out.println(e.FormatError());\n')
                    f.write('}\n')

                    f.write("try {\n")
                    f.write(d+" = "+b+".matrixpower("+str(i)+");\n")
                    f.write("} catch (WrongPower e) {\n")
                    f.write('System.out.println(e.FormatError());\n')
                    f.write('} catch (WrongLength e) {\n')
                    f.write('System.out.println(e.FormatError());\n')
                    f.write('}\n')

                    f.write("assertArrayEquals("+c+".toArray(),"+d+".toArray());\n")


f.close()
