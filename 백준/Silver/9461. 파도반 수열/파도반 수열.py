m = int(input())

for _ in range(m) :
    n = int(input())
    if 1 <= n <= 3 :
        print(1)
    elif n == 4 :
        print(2)
    else :
        dp = [0] * (n + 1)

        dp[1] = dp[2] = dp[3] = 1
        dp[4] = 2

        for i in range(5, n+1) :
            dp[i] = dp[i-1] + dp[i-5]

        print(dp[n])