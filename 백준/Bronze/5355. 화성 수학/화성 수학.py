T = int(input())

for _ in range(T):
    arr = input().split()
    
    num = float(arr[0])
    for s in arr[1:] :
        if(s == '@'):
            num *= 3
        elif(s == '%'):
            num += 5
        elif(s == '#'):
            num -= 7
        
    print(f"{num:.2f}")
