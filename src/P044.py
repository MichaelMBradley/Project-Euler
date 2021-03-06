# Pentagon numbers

p = [int(n * (3 * n - 1) / 2) for n in range(1, 2401)]
d = 0


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


for i in range(len(p) - 1):
    for j in range(i, len(p)):
        if bs(p, p[j] + p[i]) and bs(p, p[j] - p[i]):
            d = p[j] - p[i]
            break

print(d)
# 5482660
