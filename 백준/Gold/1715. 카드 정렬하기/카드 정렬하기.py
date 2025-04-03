import sys
import heapq
input = sys.stdin.readline

answer = 0
heap = []

n = int(input())

for _ in range(n):
    num = int(input())
    heapq.heappush(heap, num)

while len(heap) != 1 :
    first = heapq.heappop(heap)
    second = heapq.heappop(heap)
    sum = first + second
    answer += sum
    heapq.heappush(heap, sum)

print(answer)