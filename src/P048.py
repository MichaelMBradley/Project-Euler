# Self powers

total = 0

for i in range(1, 1001):
    curr = 1
    for j in range(i):
        curr *= i
        if curr > 9999999999:
            curr = int(str(curr)[-10:])
    total += curr
    if total > 9999999999:
        total = int(str(total)[-10:])

print(total)
# 9110846700
