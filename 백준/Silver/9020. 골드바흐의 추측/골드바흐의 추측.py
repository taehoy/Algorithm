import sys
input = sys.stdin.readline

# 에라토스테네스의 체 
MAX = 10000
is_prime = [True] * (MAX+1)
is_prime[0] = is_prime[1] = False

for i in range(2, int(MAX**0.5) + 1) :
    if is_prime[i] :
        for j in range(i*i, MAX+1, i) :
            is_prime[j] = False

# 테스트 케이스 입력
T = int(input().strip())

# 중앙 탐색 시작
for _ in range(T):
    n = int(input().strip())

    for a in range(n // 2, 1, -1) :
        b = n - a

        if is_prime[a] and is_prime[b] :
            print(a, b)
            break
