N = int(input())

for _ in range(N):
    r, e, c = map(int,input().split())

    cal = e - c

    if r > cal : print("do not advertise")
    elif r < cal : print("advertise")
    else : print("does not matter")
