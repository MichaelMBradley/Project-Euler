# Coded triangle numbers
import os

c = {}
for i in range(26):
    c[chr(i + ord("A"))] = i + 1

f = open(os.path.abspath("..") + "\\data\\P042.txt", "r")
words = f.readline().split(",")

tri = []
for i in range(20):
    tri.append(0.5 * i * (i + 1))

tris = 0
for word in words:
    sum = 0
    for ch in word[1:-1]:
        sum += c[ch]
    if sum in tri:
        tris += 1

print(tris)
# 162
