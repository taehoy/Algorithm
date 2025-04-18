n = int(input())
arr = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

dic = {}
for num in arr :
    dic[num] = 1

print(" ".join([ '1' if num in dic.keys() else '0' for num in arr2]))

