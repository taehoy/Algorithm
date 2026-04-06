from collections import Counter

N = int(input())
result = 0

for _ in range(N):
    dice = list(map(int, input().split()))
    counter = Counter(dice)

    if len(counter) == 1:
        num = dice[0]
        temp = 10000 + num * 1000
    
    elif len(counter) == 2 :
        for num, cnt in counter.items():
            if cnt == 2 :
                temp = 1000 + num * 100
                
    else :
        temp = max(dice) * 100
    
    result = max(result, temp)
print(result)