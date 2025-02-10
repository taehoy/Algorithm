T = int(input())
result = ''
for _ in range(T):
    R, S = input().split()

    for word in S:
        for _ in range(int(R)):
            result += word
    
    print(result)
    result = ''