from collections import deque

n, m = map(int, input().split())
board = [list(map(int, input())) for _ in range(n)]

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

def BFS(x, y):
    q = deque()
    q.append([x,y])

    while q :
        x,y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if board[nx][ny] == 0 : continue
            if board[nx][ny] == 1 :
                board[nx][ny] = board[x][y]+1
                q.append([nx, ny])
        
    return board[n-1][m-1]

print(BFS(0,0))

