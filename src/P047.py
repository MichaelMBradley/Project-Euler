# Distinct primes factors

primes = []
sieve = [False, False] + [True] * 149998

for i in range(2, len(sieve)):
    if sieve[i]:
        primes.append(i)
        for j in range(2 * i, len(sieve), i):
            sieve[j] = False

f = 0
cons = [{2: True}, {3: True}, {2: True}, {5: True}]
for i in range(4, len(sieve)):
    cons.pop(0)
    newdict = {}
    n = i
    j = 0
    while n > 1:
        if n % primes[j] == 0:
            n /= primes[j]
            newdict[primes[j]] = True
        else:
            j += 1
    cons.append(newdict)

    con = True
    totaldict = {}
    for d in cons:
        if len(d) != len(cons):
            con = False
    if con:
        f = i - len(cons) + 1
        break

print(f)
# 134043
