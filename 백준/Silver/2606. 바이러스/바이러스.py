import sys
from collections import deque
input = sys.stdin.readline

def bfs(idx) :
    global visited
    visited[idx] = True    
    answer = 0
    q = deque([idx])
    
    while q :
        cur = q.popleft()
        
        for next in graph[cur] :
            if not visited[next] :
                visited[next] = True
                answer += 1
                q.append(next)

    return answer


# 입력 및 초기화
n = int(input())
m = int(input())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for _ in range(m) :
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# bfs
print(bfs(1))