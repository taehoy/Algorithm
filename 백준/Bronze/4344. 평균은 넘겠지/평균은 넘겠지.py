n = int(input())

for _ in range(n):
    n, *arr = map(int, input().split())

    total = sum(arr)

    avg = total / n
    count = 0

    for i in arr :
        if i > avg :
            count += 1
    
    result = count / n * 100
    print(f"{result:.3f}%")