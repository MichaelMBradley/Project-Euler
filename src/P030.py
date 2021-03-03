# Digit Fifth Powers

sum = 0
for i in range(10, 354295):
    nsum = 0
    for n in str(i):
        nsum += int(n) ** 5

    if nsum == i:
        sum += i

print(sum)
# 443839
