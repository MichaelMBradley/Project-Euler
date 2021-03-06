# Champernowne's constant

rng = (0, 0)
i = 0
ans = 1
target = 1
while rng[1] < 1000000:
    i += 1
    si = str(i)
    rng = (rng[1], rng[1] + len(si))
    if rng[0] < target <= rng[1]:
        ans *= int(si[target - rng[0] - 1])
        target *= 10

print(ans)
# 210
