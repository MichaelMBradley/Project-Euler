# Coin sums

numways = 0
coins = [200, 100, 50, 20, 10, 5, 2, 1]


def comb(total, lcoin):
    global numways
    if total == 200 or lcoin == 1:
        numways += 1
    else:
        for c in coins:
            if total + c <= 200 and c <= lcoin:
                comb(total + c, c)


comb(0, 1e6)
print(numways)
# 73682
