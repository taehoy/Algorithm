import sys
from collections import deque
input = sys.stdin.readline

def bfs(y, x) :
    visited = [[-1] * l for _ in range(l)]
    q = deque([(y, x)])
    visited[y][x] = 0

    while q :
        y, x = q.popleft()

        if (y, x) == (target_y, target_x) :
            return visited[y][x]

        for dy, dx in directions :
            ny = y + dy
            nx = x + dx

            if 0 <= ny < l and 0 <= nx < l :
                if visited[ny][nx] == -1 :
                    visited[ny][nx] = visited[y][x] + 1
                    q.append((ny,nx))

    return "갈수없음"

T = int(input())

directions = [(-1, -2),(-2,-1),(-2, 1),(-1, 2),(1,2),(2,1),(1,-2),(2,-1)]

for _ in range(T):
    # 입력 및 초기화
    l = int(input())
    cy, cx = map(int,input().split())
    target_y, target_x = map(int, input().split())

    # bfs
    print(bfs(cy,cx))