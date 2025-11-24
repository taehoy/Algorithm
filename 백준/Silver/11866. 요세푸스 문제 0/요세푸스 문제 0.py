from collections import deque

n, k = map(int ,input().split())
dq = deque(range(1, n+1))
answer = []

while dq:
    dq.rotate(-(k-1))
    answer.append(dq.popleft())

print(f"<{', '.join(map(str, answer))}>")