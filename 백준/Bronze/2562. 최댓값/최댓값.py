index = 0
max = 0

l = []

for i in range(9):
    n = int(input())
    if max <= n :
        max = n
        index = i

print(max)
print(index+1)