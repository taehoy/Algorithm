n = int(input())
arr = list(map(int, input().split()))
x = int(input())

arr.sort()

left = 0
right = n-1
answer = 0 

while left < right :
    sum = arr[left] + arr[right]
    
    if sum > x :
        right -= 1
    elif sum < x :
        left += 1
    else :
        answer+=1
        right -= 1
        left += 1

print(answer)

    
    