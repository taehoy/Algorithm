arr = [list(map(int, input().split())) for _ in range(5)]

index = 0
result = 0
total = 0
for arr2 in arr :
    index += 1
    if total < sum(arr2) :
        total = sum(arr2)
        result = index

print(result, total)