import sys
from collections import deque
input = sys.stdin.readline

def bfs(y, x) :
    q = deque([(y, x)])
    graph[y][x] = 2
    count = 1
    while q :
        y, x = q.popleft()
        
        for i in range(4) :
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < n :
                if graph[ny][nx] == 1 :
                    count +=1
                    graph[ny][nx] = 2 
                    q.append((ny,nx))

    return count 
# 입력 및 초기화
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
n = int(input())
graph = []

for _ in range(n) :
    graph.append(list(map(int,input().rstrip())))

count = 0
answer = []

# bfs
for i in range(n) :
    for j in range(n) :
        if graph[i][j] == 1 :
            answer.append(bfs(i,j))

print(len(answer))
for cnt in sorted(answer) :
    print(cnt)