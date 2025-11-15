arr = [False] * 30

for _ in range(28):
    i = int(input())
    
    arr[i-1] = True
    
for i in range(30) :
    if arr[i] == False :
        print(i+1, end=' ')

        