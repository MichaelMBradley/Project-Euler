#Number spiral diagonals
spiralSize = 1001
sum = 1
for i in range(3, spiralSize+1, 2):
    for j in range(4):
        sum += (i**2) - (j*(i-1))
print(sum)
#669171001