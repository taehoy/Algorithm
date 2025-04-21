import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)

# def bfs(y, x) :
    # q = deque([(y, x)])
    # graph[y][x] = 2
    # while q :
    #     y, x = q.popleft()
        
    #     for i in range(4) :
    #         nx = x + dx[i]
    #         ny = y + dy[i]

    #         if 0 <= nx < M and 0 <= ny < N :
    #             if graph[ny][nx] == 1 :
    #                 graph[ny][nx] = 2
    #                 q.append((ny,nx))

def dfs(y, x) :
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < M and 0 <= ny < N :
            if graph[ny][nx] == 1 :
                graph[ny][nx] = 2
                dfs(ny, nx)

# 입력 및 초기화
T = int(input())

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

for _ in range(T):
    M, N, K = map(int, input().split())

    graph = [[0] * (M) for _ in range(N)]
    count = 0
    
    for i in range(K) :
        a, b = map(int, input().split())
        graph[b][a] = 1
    
    # bfs
    for i in range(N) :
        for j in range(M) :
            if graph[i][j] == 1 :
                count += 1
                dfs(i,j)
    print(count)