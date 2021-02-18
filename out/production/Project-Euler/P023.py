#Non-abundant sums
def ab(n):
    s = 0
    for i in range(1, int(n/2)+1):
        if n%i == 0:
            s += i
    if n<s:
        return True
    else:
        return False
MAX = 28124 #28124
su = 0
nums = [False] * MAX
va = False

for j in range(1, MAX):
    if ab(j):
        nums[j] = True
    va = False
    for k in range(len(nums)):
        if nums[k] == True and nums[j-k] == True:
            va = True
            break
    if va == False:
        su+=j

print(su)
#4179871