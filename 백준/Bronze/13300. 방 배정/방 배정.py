n, k = map(int, input().split())

arr = [[0,0] for _ in range(7)]

for _ in range(n):
    s, y = map(int, input().split())
    arr[y][s] += 1

answer = 0

for i in range(1,7):
    for j in range(2):
        answer += (arr[i][j]+ (k-1)) // k

print(answer)