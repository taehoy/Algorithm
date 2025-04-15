n = int(input())

arr = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

dic = {}
for num in arr :
    dic[num] = 1

for num in arr2 :
    if num in dic:
        print(1)
    else : 
        print(0)