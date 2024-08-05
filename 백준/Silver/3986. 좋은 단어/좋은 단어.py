n = int(input())
count = 0

for i in range(n) :
    a = input()
    stack = []

    for j in a :
        if j == 'A' :
            if len(stack) != 0 and stack[-1] == 'A' :
                stack.pop()
            else :
                stack.append('A')
        elif j == 'B' :
            if len(stack) != 0 and stack[-1] == 'B' :
                stack.pop()
            else :
                stack.append('B')
    
    if len(stack) == 0 :
        count = count+1

print(count)