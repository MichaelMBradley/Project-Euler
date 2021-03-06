# Digit cancelling fractions

valid = []

for n in range(10, 99):
    for d in range(n + 1, 100):
        for i in range(len(str(n))):
            for j in range(len(str(d))):
                if (
                    str(n)[i : i + 1] == str(d)[j : j + 1]
                    and not n % 11 == 0
                    and not d % 11 == 0
                ):
                    nn = int(str(n).replace(str(n)[i], ""))
                    nd = int(str(d).replace(str(d)[j], ""))
                    if 0 not in (nn, nd) and not nn == n / 10 and not nd == d / 10:
                        if n / d == nn / nd:
                            valid.append((n, d))

num = 1
den = 1

for v in valid:
    num *= v[0]
    den *= v[1]

for k in range(
    2, int(num / 2)
):  # It would be more efficient to use primes, but it's fast enough anyways
    while num % k == 0 and den % k == 0:
        num /= k
        den /= k

print(int(den))
# 100
