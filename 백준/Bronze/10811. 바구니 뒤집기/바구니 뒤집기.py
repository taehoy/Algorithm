n, m = map(int,input().split())

arr = []
for i in range(n) :
    arr.append(i+1)

for _ in range(m) :
    i, j = map(int, input().split())
    
    i = i-1
    j = j-1
    
    while i < j :
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i+= 1
        j -= 1
print(*arr)