n = int(input())
arr = set(map(int, input().split()))

m = int(input())
arr2 = map(int, input().split())

for num in arr2:
    print(1 if num in arr else 0)