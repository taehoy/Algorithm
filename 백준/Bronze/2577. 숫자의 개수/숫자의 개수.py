arr = [0] * 10

a = int(input())
b = int(input())
c = int(input())

total = a * b * c

for i in str(total):
    arr[int(i)] += 1

print('\n'.join(map(str, arr)))