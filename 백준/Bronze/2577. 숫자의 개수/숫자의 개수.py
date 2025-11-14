result = [0] * 10

arr = []
for _ in range(3):
    arr.append(int(input()))
    
total = arr[0] * arr[1] * arr[2]

while total > 0 :
    result[total % 10] += 1
    total = total // 10
    
for i in result :
    print(i)