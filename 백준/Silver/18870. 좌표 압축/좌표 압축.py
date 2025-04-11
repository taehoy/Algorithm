import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

arr_sorted = sorted(set(arr))

dic = {num : idx for idx, num in enumerate(arr_sorted)}

result = [str(dic[num]) for num in arr]
print(' '.join(result))