# Goldbach's other conjecture
import math

primes = []
sieve = [False, False] + [True] * 9998
comp = 0
for i in range(2, len(sieve)):
    con = False
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False
    elif i % 2 == 1:
        for p in primes:
            t = math.sqrt((i - p) / 2)
            if t == int(t):
                con = True
        if not con:
            comp = i
            break

print(comp)
# 5777
