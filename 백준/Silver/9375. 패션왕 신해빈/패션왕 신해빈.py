testcase = int(input())

for _ in range(testcase) :
    n = int(input())
    answer = 1
    map = {}

    for i in range(n):
        name, cloth = input().split()

        if not cloth in map :
            map[cloth] = 1
        else :
            map[cloth] += 1
    
    for k in map.keys() :
        answer = answer * (map[k]+1)

    print(answer-1)