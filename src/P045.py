# Triangular, pentagonal, and hexagonal


def bs(a, n):
    if len(a) > 1:
        if a[len(a) // 2] == n:
            return True
        elif a[len(a) // 2] < n:
            return bs(a[len(a) // 2 :], n)
        elif a[len(a) // 2] > n:
            return bs(a[: len(a) // 2], n)
    else:
        return a[0] == n


next = 0
max = 100000
tri = [int(i * (i + 1) / 2) for i in range(1, max + 1)]
pent = [int(i * (3 * i - 1) / 2) for i in range(1, max + 1)]
hex = [i * (2 * i - 1) for i in range(1, max + 1)]

for n in hex[144:]:
    if bs(tri, n) and bs(pent, n):
        next = n

print(next)
# ans
