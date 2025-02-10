import sys
input = sys.stdin.readline

def solution(arr, x) :
    numset = set(arr)
    cnt = 0
    for num in arr :
        if x - num in numset :
            cnt += 1
    return cnt // 2


n = int(input().strip())
arr = list(map(int, input().split()))
x = int(input().strip())

print(solution(arr, x))