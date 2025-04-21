import sys
from collections import deque
input = sys.stdin.readline

def bfs(start) :
    q = deque([start])
    visited[start] = 0
    
    while q : 
        cur = q.popleft()
        
        if cur == K :
            return visited[cur]
        
        for next in [cur-1, cur+1, cur * 2] :
            if 0 <= next <= 100000 and visited[next] == -1  :
                visited[next] = visited[cur]+1
                q.append(next)
    

# 입력 초기화
N, K = map(int, input().split())

visited = [-1] * (100001)

print(bfs(N))