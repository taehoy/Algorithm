s = input()

c1 = ''

result = 0
for c in s :
    if c1 != c :
        result += 10
        c1 = c
    else :
        result += 5

print(result)