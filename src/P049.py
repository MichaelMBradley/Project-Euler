# Prime permutations


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


def p(a1, a2):
    a1 = str(a1)
    a2 = str(a2)
    prod1 = 1
    prod2 = 1
    for a in a1:
        prod1 *= primes[int(a)]
    for a in a2:
        prod2 *= primes[int(a)]
    return prod1 == prod2


primes = []
sieve = [False, False] + [True] * 9998
ans = []

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

for n in range(len(primes)):
    if primes[n] > 1000:
        primes = primes[n:]
        break

for i in range(len(primes)):
    for j in range(i + 1, len(primes)):
        diff = primes[j] - primes[i]
        if (
            bs(primes, primes[j] + diff)
            and p(primes[i], primes[j])
            and p(primes[i], primes[j] + diff)
        ):
            ans.append(str(primes[i]) + str(primes[j]) + str(primes[j] + diff))

print(ans[1])
# 296962999629
