room = input()

arr = [0] * 10

for c in room :
    if c == '6' or c == '9' :
        arr[6] += 1
    else :
        arr[int(c)] += 1

arr[6] = (arr[6] + 1) // 2

result = max(arr)

print(result)