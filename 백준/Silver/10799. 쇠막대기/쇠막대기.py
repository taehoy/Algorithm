galho = input()
answer = 0
stack = []

for i in range(len(galho)) :
    if galho[i] == '(' :
        stack.append(galho[i])
    else :
        if galho[i-1] == '(' :
            stack.pop()
            answer += len(stack)
        else :
            stack.pop()
            answer += 1

print(answer)