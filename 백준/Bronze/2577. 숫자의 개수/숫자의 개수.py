a = 1
for _ in range(3):
    a *= int(input())

a = str(a)

for i in range(10):
    print(a.count(str(i)))