# Sub-string divisibility

sum = 0
p = [0, 2, 3, 5, 7, 11, 13, 17]


def c(si, r):
    global sum
    if len(r) != 0:
        for i in range(len(r)):
            new = r.copy()
            new.pop(i)
            c(si + r[i], new)
    else:
        v = True
        for j in range(1, 8):
            if j != 7:
                sub = si[j : j + 3]
            else:
                sub = si[j:]
            if int(sub) % p[j] != 0:
                v = False
        if v:
            sum += int(si)


c("", [str(i) for i in range(10)])

print(sum)
# 16695334890
