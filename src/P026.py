# Reciprocal Cycles
from decimal import *

d = 0
n = 0
getcontext().prec = 2000
for i in range(2, 1000):
    dec = str(Decimal(1) / Decimal(i))[2:]
    ldec = len(dec)
    repeat = True
    for j in range(ldec - 1):
        for k in range(1, ldec - j - 1):
            repeat = True
            njump = int((ldec - j) / k)
            if njump <= 1:
                break
            for l in range(1, njump):
                if dec[j : j + k] != dec[j + l * k : j + (l + 1) * k]:
                    repeat = False
                    break
            if repeat and k > n:
                n = k
                d = i
            if repeat:
                break
        if repeat:
            break

print(d)
# 983
