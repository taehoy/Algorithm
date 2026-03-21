T = int(input())

for i in range(T) :
    a, b = list(map(int, input().split()))
    
    print("Case #"+ str(i+1) + ": " + str((a+b)))