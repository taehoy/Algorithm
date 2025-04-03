n = int(input())

for _ in range(n):
    ps = input()
    stack = []
    flag = False

    for s in ps :
        if s == '(' :
            stack.append('(')
        else :
            if len(stack) == 0 :
                flag = True
                break
            else :
                stack.pop()

    if len(stack) != 0 :
        flag = True

    if flag :
        print("NO")
    else :
        print("YES")