import sys
import heapq
input = sys.stdin.readline

n = int(input())
heap = []

for _ in range(n):
    num = int(input())

    # x가 자연수면 힙에 삽입한다.
    if num != 0 :
        heapq.heappush(heap, (-num))
    elif num == 0 :
        try :
            print(-1 * heapq.heappop(heap))
        except :
            print(0)
