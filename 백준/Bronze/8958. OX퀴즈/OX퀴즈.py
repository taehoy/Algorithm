n = int(input())

for _ in range(n):
    st = input()

    num = 0 
    result = 0
    for s in st :
        if s == "O" :
            num += 1
            result += num
        else :
            num = 0
    print(result)