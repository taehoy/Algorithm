n = int(input())

for _ in range(n) :
    m = int(input())
    answer = 1
    dic = {}

    for _ in range(m) :
        name , type = input().split()
        
        if not type in dic :
            dic[type] = 1
        else :
            dic[type] += 1
    
    for key in dic.keys() :
        answer = answer * (dic[key] + 1)
    
    print(answer-1)
    
    