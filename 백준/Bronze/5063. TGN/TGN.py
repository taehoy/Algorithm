N = int(input())
result = []

for _ in range(N):
    r, e, c = map(int,input().split())

    cal = e - c

    if r > cal : result.append("do not advertise")
    elif r < cal : result.append("advertise")
    else : result.append("does not matter")

print("\n".join(result))
