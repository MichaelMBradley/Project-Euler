# Double-base palindromes


def p(n):
    for i in range(len(n) // 2):
        if n[i] != n[-1 - i]:
            return False
    return True


sum = 0

for i in range(1000000):
    s10 = str(i)
    s2 = str(bin(i))[2:]
    if p(s10) & p(s2):
        sum += i

print(sum)
# 872187
