a=input()
b=[]
x=''
for i in a:
    b.append(i)
b.sort()
for i in range(len(b)):
    x+=b[i]
print(x)
