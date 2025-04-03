import sys
input = sys.stdin.readline

equtation = input().split("-")

first_line = map(int,equtation[0].split("+"))

answer = sum(first_line)

for i in equtation[1:] :
    arr2 = map(int,i.split("+"))
    answer -= sum(arr2)

print(answer)