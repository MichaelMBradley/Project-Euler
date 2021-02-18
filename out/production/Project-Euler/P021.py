#Amicable numbers
def amiSum(n):
    aS = 0
    for x in range(1, int(n/2 + 1)):
        y = x
        if n % y == 0:
            aS += y
    return aS

s = 0
for x in range(1, 10000):
    a = amiSum(x)
    if amiSum(a) == x and a < 10000 and x != a:
        s += x

print(s)
#31626