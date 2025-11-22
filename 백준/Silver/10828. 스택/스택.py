import sys
input = sys.stdin.readline

s = []

n = int(input())

for _ in range(n):
    cmd = input().split()
    
    if cmd[0] == "push":
        s.append(cmd[1])
    elif cmd[0] == "top":
        if len(s) == 0 :
            print(-1)
        else :
            print(s[-1])
    elif cmd[0] == "size":
        print(len(s))
    elif cmd[0] == "pop":
        if len(s) == 0 :
            print(-1)
        else :
            print(s.pop())
    elif cmd[0] == "empty":
        if len(s) == 0 :
            print(1)
        else :
            print(0)

    
    