# Circular primes
import math as m

primes = []
sieve = [False, False] + [True] * (int(1e6) - 2)

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

num = 0
for p in primes:
    c = True
    l = int(m.floor(m.log10(p))) + 1
    for n in [0, 2, 4, 5, 6, 8]:
        if str(n) in str(p):
            c = False
            break
    if c:
        for i in range(1, l):
            if p // (10 ** i) + (p % (10 ** i)) * (10 ** (l - i)) not in primes:
                c = False
                break
    if c:
        num += 1

print(num)
# 53
