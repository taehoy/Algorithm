def dfs(idx, sum) :
    global answer
    if idx >= n :
        return
    
    sum += arr[idx]
    if sum == s :
        answer +=1
    
    dfs(idx + 1, sum - arr[idx])
    dfs(idx + 1, sum)

# 초기화
n, s = map(int, input().split())
arr = list(map(int, input().split()))

answer = 0

# dfs
dfs(0,0)
print(answer)
