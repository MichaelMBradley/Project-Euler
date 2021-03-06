# Integer right triangles

max = (0, 0)
for p in range(12, 1001):
    sol = 0
    for c in range(5, p - 1):
        for b in range(c):
            if pow(p - c - b, 2) + pow(b, 2) == pow(c, 2):
                sol += 1
    if sol > max[1]:
        max = (p, sol)

print(max[0])
# 840 FIXME: inefficient
