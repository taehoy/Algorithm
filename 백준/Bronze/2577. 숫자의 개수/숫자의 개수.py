a = 1

for _ in range(3):
    a *= int(input())

arr = list(str(a))

for i in range(10):
    print(arr.count(str(i)))