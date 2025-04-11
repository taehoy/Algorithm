n = int(input())

arr = []

while n >= 1 :
    num = n % 10
    arr.append(num)
    n //= 10

arr.sort(reverse=True)

print(*arr, sep="")