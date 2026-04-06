N = int(input())
result = 0 

for _ in range(N):
    a, b, c = map(int,input().split())

    if a == b and b == c :
        temp = 10000 +  a * 1000
    elif a == b and b != c :
        temp = 1000 + a * 100
    elif a == c and a != b :
        temp = 1000 + a * 100
    elif b == c and a != b :
        temp = 1000 + b * 100
    elif a != b and b != c and a != c:
        temp = max([a, b, c]) * 100
    
    if result < temp :
        result = temp

print(result)