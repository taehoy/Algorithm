T = int(input())

for _ in range(T):
    arr = input().split()
    
    num = 0.0
    for s in arr :
        if(s == '@'):
            num *= 3
        elif(s == '%'):
            num += 5
        elif(s == '#'):
            num -= 7
        else :
            num = float(s)
        
    print(f"{num:.2f}")