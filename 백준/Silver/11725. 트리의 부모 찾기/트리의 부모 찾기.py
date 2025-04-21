import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)

def dfs(idx) :

    for next in graph[idx] :
        if not visited[next] :
            answer[next] = idx
            visited[next] = True
            dfs(next)

# 입력 및 초기화
n = int(input())
graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
answer = {}

for _ in range(n-1) :
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# dfs
visited[1] = True

dfs(1)

for idx in range(2, n+1) :
    print(answer[idx])
