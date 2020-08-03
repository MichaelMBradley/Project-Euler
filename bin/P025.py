#1000-digit Fibonacci number
f0 = "1"
f1 = "1"
f2 = ""

a = 2

while len(f2)<1000:
    f2 = ""
    a+=1
    f1 = f1[::-1]
    for i in range(len(f0)):
        temp = int(f0[len(f0)-1-i])
        if len(f2)==i+1:
            temp+=int(f2[0])
            f2 = f2[1:]
        f2 = str(temp+int(f1[i])) + f2
    if len(f1)>len(f0):
        if len(f1)>len(f2):
            f2 = f1[-1] + f2
        else:
            f2 = str(int(f2[0]) + int(f1[-1])) + f2[1:]
    
    f0 = f1[::-1]
    f1 = f2
    
print(a)
#4782