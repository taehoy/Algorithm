from collections import deque

n,m = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(n)]
vis = [[False for _ in range(m)] for _ in range(n)]
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


mx = 0 # 그림 넓이 최댓값
num = 0 # 그림의 개수

for i in range(n) :
    for j in range(m) :
        if board[i][j] == 0 or vis[i][j] : continue
        
        num += 1
        q = deque()
        vis[i][j] = True
        q.append([i,j])

        area = 0 # 그림 크기

        while len(q) != 0 :
            area += 1
            x, y = q.popleft()

            for k in range(4) :
                nx = x + dx[k]
                ny = y + dy[k]
                if nx <0 or nx >=n or ny < 0 or ny >=m : continue
                if board[nx][ny] == 0 or vis[nx][ny] : continue
                vis[nx][ny] = True
                q.append([nx,ny])
                
        mx = max(mx, area)

print(num)
print(mx)
