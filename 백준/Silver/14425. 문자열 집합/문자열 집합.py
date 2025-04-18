n, m = map(int, input().split())

arr = [input() for _ in range(n)]
arr2 = [input() for _ in range(m)]

dic = {}
for num in arr :
    dic[num] = 1

answer = 0

for num in arr2 :
    if num in dic.keys() :
        answer += 1

print(answer)