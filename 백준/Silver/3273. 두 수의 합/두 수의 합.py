import sys

input = sys.stdin.readline
n = int(input().strip())
arr = list(map(int, input().split()))
x = int(input().strip())

arr.sort()

left, right = 0, n-1
count = 0 # 정답 개수

while left < right :
    total = arr[left] + arr[right]

    if total == x :
        count += 1
        left += 1
        right -= 1
    elif total < x :
        left += 1
    else :
        right -= 1

print(count)