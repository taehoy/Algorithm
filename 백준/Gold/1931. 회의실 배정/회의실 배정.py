import sys
input = sys.stdin.readline

n = int(input())
meets = [list(map(int,input().split())) for _ in range(n)]

meets.sort(key=lambda x:(x[1],x[0]))

answer = 0
endTime = 0

for i in range(len(meets)) :
    if endTime <= meets[i][0] :
        endTime = meets[i][1]
        answer += 1
print(answer )