# Pandigital multiples


def p9(n):
    if len(n) != 9:
        return False
    else:
        for i in range(1, 10):
            if str(i) not in n:
                return False
        return True


max = 0

for i in range(10000):
    prod = ""
    j = 0
    while len(prod) < 9:
        j += 1
        prod += str(i * j)
    if p9(prod) and int(prod) > max:
        max = int(prod)

print(max)
# 932718654
