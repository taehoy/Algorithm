n = int(input())
arr = list(map(int, input().split()))
# 정렬한다.
arr.sort()
# 최대,최소를 구한다.
## 최대 : 마지막(n-1) 인덱스요소
## 최소 : 인덱스 0 요소 
print(arr[0], arr[n-1])