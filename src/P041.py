# Pandigital prime
import math

primes = []
sieve = [False, False] + [True] * 9999998
max = 0

for i in range(2, len(sieve)):
    if sieve[i]:
        si = str(i)
        pan = True
        for j in range(1, int(math.log10(i)) + 2):
            if str(j) not in si:
                pan = False
        if pan:
            max = i
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

print(max)
# 7652413
