#Names scores
def cVal(m):
    s = 0
    for n in m:
        if n != '"':
            s += ord(n) - ord('A') + 1
    return s

f = open("C:\\Users\micha\OneDrive\Documents\GitHub\Project-Euler\data\P022.txt", "r")

names = f.readline().split(",")
f.close()
names.sort()

su = 0

for y in range(len(names)):
    su += (cVal(names[y]) * (y+1))

print(su)
#871198282