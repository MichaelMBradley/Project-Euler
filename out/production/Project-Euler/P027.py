# Quadratic Primes


primes = []
sieve = [False, False] + [True] * 9998

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2*i, len(sieve), i):
            sieve[j] = False

maxn = 0
product = 0

print(primes)

# ans
