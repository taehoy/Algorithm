n = int(input())
arr = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

dic = {}
for num in arr :
    dic[num] = 1

answer = []

for num in arr2 :
    if num in dic.keys() :
        answer.append('1')
    else :
        answer.append('0')

print(" ".join(answer))

