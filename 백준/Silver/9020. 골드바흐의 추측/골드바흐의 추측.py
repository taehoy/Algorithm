import sys

# 🔹 에라토스테네스의 체를 사용해 10,000까지의 소수를 미리 계산
MAX = 10000
is_prime = [True] * (MAX + 1)
is_prime[0] = is_prime[1] = False  # 0과 1은 소수가 아님

for i in range(2, int(MAX**0.5) + 1):
    if is_prime[i]:  # 소수인 경우
        for j in range(i * i, MAX + 1, i):  # 배수 제거
            is_prime[j] = False

# 🔹 테스트 케이스 입력 받기
T = int(sys.stdin.readline().strip())

for _ in range(T):
    n = int(sys.stdin.readline().strip())

    # 🔹 n을 만들 수 있는 두 소수 찾기 (중앙에서 점점 벌어지는 방식)
    for a in range(n // 2, 1, -1):  # n//2부터 감소하면서 탐색
        b = n - a  # b를 자동으로 결정
        if is_prime[a] and is_prime[b]:  # 두 수가 모두 소수라면 정답
            print(a, b)
            break  # 가장 차이가 작은 조합을 찾으면 즉시 종료
