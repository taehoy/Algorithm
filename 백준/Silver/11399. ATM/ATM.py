n = int(input())

arr = list(map(int, input().split()))
arr.sort()

result = 0
answer = 0
for num in arr :
    result += num
    answer += result

print(answer)