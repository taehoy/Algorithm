from itertools import accumulate

n = int(input())

arr = list(map(int, input().split()))
arr.sort()

print(sum(accumulate(arr)))