arr = [0] * 42

for _ in range(10):
    n = int(input())
    
    if arr[n % 42] == 1 :
        continue
    arr[n % 42] = 1

print(arr.count(1))