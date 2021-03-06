# Truncatable primes
import math


def t(p):
    if v(p):
        for i in range(1, int(math.log10(p)) + 1):
            if p % (10 ** i) not in primes or p // (10 ** i) not in primes:
                return False
        return True
    else:
        return False


def v(p):
    ps = str(p)[1:]
    for i in ["0", "2", "4", "5", "6", "8"]:
        if i in ps:
            return False
    return True


primes = []
sieve = [False, False] + [True] * 999998

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

sum = 0

for p in primes[4:]:
    if t(p):
        sum += p

print(sum)
# 748317
