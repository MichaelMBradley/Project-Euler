# Digit Factorials


def f(n):
    p = 1
    for i in range(1, n + 1):
        p *= i
    return p


sum = 0
for i in range(3, int(1e6)):
    sumn = 0
    for n in str(i):
        sumn += f(int(n))
    if i == sumn:
        sum += i

print(sum)
# 40730
