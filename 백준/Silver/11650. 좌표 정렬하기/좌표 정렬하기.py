import sys
input= sys.stdin.readline

N = int(input())

# 좌표 입력받기
map = [input().rstrip().split() for _ in range(N)]

# x좌표 -> y 좌표 순으로 정렬하기
sorted_map = sorted(map, key=lambda x: (int(x[0]), int(x[1])))

for x in sorted_map :
    print(x[0], x[1])