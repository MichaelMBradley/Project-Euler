# Pandigital products


def pan9(a, b):
    seq = str(a) + str(b) + str(a * b)
    if len(seq) != 9:
        return False
    else:
        for n in range(1, 10):
            if not str(n) in seq:
                return False
        return True


sum = 0
ans = []

for a in range(100):
    for b in range(a, 10000):
        if pan9(a, b) and a * b not in ans:
            sum += a * b
            ans.append(a * b)

print(f"\n{sum}")
# 45228
