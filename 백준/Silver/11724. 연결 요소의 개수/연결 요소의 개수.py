import sys
from collections import deque
input = sys.stdin.readline

def bfs(idx) :
    q = deque([idx])
    visited[idx] = True

    while q :
        cur = q.popleft()
        for next in range(1, n+1) :
            if not visited[next] and graph[cur][next] :
                visited[next] = True
                q.append(next)

n, m = map(int, input().split())

graph = [[False] * (n+1) for _ in range(n+1)]
visited = [False] * (n+1)
for _ in range(m) :
    a, b = map(int, input().split())
    graph[a][b] = True
    graph[b][a] = True

# bfs
answer = 0
for i in range(1, n+1) :
    if not visited[i] :
        answer += 1
        bfs(i)

print(answer)