room = input()

arr = [0] * 10

for c in room :
    if c == '6' or c == '9' :
        arr[6] += 1
    else :
        arr[int(c)] += 1

arr[6] = (arr[6] + 1) // 2

max = arr[0]

for i in range(1, 10) :
    if max < arr[i] :
        max = arr[i]

print(max)