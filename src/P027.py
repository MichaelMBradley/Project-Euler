# Quadratic Primes

primes = []
sieve = [False, False] + [True] * 9998

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

maxn = 0
product = 0

for a in range(-1000, 1001):
    for b in primes:
        if b > 1000:
            break

        n = 0
        while ((n ** 2) + (a * n) + b) in primes:
            n += 1

        if n > maxn:
            maxn = n
            product = a * b

print(product)
# -59231
