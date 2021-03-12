# Consecutive prime sum


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


primes = []
sieve = [False, False] + [True] * 999998
ans = (0, 0)

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

for i in range(len(primes)):
    sum = primes[i]
    for j in range(i + 1, len(primes)):
        sum += primes[j]
        if sum > len(sieve):
            break
        if j - i + 1 > ans[1] and bs(primes, sum):
            ans = (sum, j - i + 1)

print(ans[0])
# 997651
