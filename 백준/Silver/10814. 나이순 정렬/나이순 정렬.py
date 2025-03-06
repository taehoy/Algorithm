import sys
input = sys.stdin.readline

N = int(input())

users = [input().rstrip().split() for _ in range(N)]

sorted_users = sorted(users, key=lambda x: int(x[0]))

for user in sorted_users :
    print(user[0], user[1])
