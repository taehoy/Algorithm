N = int(input())
result = 0 

for _ in range(N):
    dice = list(map(int, input().split()))

    dice_set = set(dice)

    if len(dice_set) == 1 :
        temp = 10000 + dice[0] * 1000
    
    elif len(dice_set) == 2 :
        for num in dice_set :
            if dice.count(num) == 2 :
                temp = 1000 + num * 100
                break
    elif len(dice_set) == 3:
        temp = max(dice) * 100
    
    result = max(result, temp)


print(result)