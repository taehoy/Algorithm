n = int(input())

for _ in range(n):
    arr = list(map(int, input().split()))[1:]

    total = sum(arr)
    length = len(arr)

    avg = total / length
    count = 0

    for i in arr :
        if i > avg :
            count += 1
    
    result = count / length * 100
    print(f"{result:.3f}%")