while(True) :
    st = input()
    stack = []

    if st == '.' :
        break

    for s in st :
        if s == '(' or s == '[' :
            stack.append(s)
        elif s == ')' :
            if len(stack) != 0 and stack[-1] == '(' :
                stack.pop()
            else :
                stack.append(s)
                break
        elif s == ']' :
            if len(stack) != 0 and stack[-1] == '[' :
                stack.pop()
            else :
                stack.append(s)
                break

    if len(stack) == 0 :
        print("yes")
    else :
        print("no")