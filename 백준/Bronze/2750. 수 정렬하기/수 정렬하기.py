n = int(input())

nums = [int(input()) for _ in range(n)]
nums.sort()
print(*nums, sep="\n")