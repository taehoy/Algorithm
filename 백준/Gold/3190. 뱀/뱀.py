import sys
from collections import deque
input = sys.stdin.readline

def direction_change(d, c) :
    if c == "L" :
        d = (d - 1) % 4
    else :
        d = (d + 1) % 4
    
    return d

N = int(input())
K = int(input())

# board의 값 의미
# 0 -> 아무것도 아님
# 1 -> 사과
# 2 -> 뱀 위치
board = [[0] * N for _ in range(N)]

# board 내 사과 위치
for _ in range(K) :
    a, b = map(int, input().split())
    board[a-1][b-1] = 1

# 뱀 방향 변환 횟수 L 
L = int(input())

# 뱀 방향을 담을 변수 생성 times
times ={}
for i in range(L) :
    a, b = input().split()
    times[int(a)] = b

# 상하좌우 좌표 이동
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

# 방향변수, 시간변수(결과값), 현재 뱀 위치 좌표 변수 선언
direction = 1 # 오른쪽 스타트
time = 1
y, x = 0, 0 
snake = deque([[y, x]])
board[y][x] = 2

while True :
    y, x = y + dy[direction], x + dx[direction]
    if 0 <= y <N and 0<= x < N and board[y][x] != 2 :
        if not board[y][x] == 1 :
            delY, delX = snake.popleft()
            board[delY][delX] = 0
        board[y][x] = 2
        snake.append([y,x])
        if time in times.keys() :
            direction = direction_change(direction, times[time])
        time += 1
    else :
        break

print(time)