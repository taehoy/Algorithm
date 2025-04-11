n = 5

arr = [int(input()) for _ in range(n)]
arr.sort()

print(sum(arr) // n)
print(arr[2])