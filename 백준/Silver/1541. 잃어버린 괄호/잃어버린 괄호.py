import sys
input = sys.stdin.readline

arr = input().split("-")

first_line = map(int,arr[0].split("+"))

answer = sum(first_line)
minus_total = 0

for i in range(1, len(arr)) :
    arr2 = map(int,arr[i].split("+"))
    minus_total += sum(arr2)

print(answer - minus_total)