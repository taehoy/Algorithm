n, k = map(int ,input().split())

arr = []
answer = []
for i in range(1,n+1):
    arr.append(i)

i = 1
while(len(arr) > 1) :
    if i == k :
        answer.append(arr.pop(0))
        i = 1
    else :
        arr.append(arr.pop(0))
        i+=1

answer.append(arr[0])

print("<" + ", ".join(map(str, answer)) + ">")