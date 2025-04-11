import sys
input = sys.stdin.readline
write = sys.stdout.write

n = int(input())
count = [0] * 10001 # 입력값 범위 1 ~ 10000

for _ in range(n) :
    count[int(input())] += 1

for i in range(1, 10001):
    if count[i] != 0 :
        for j in range(count[i]):
            print(i)