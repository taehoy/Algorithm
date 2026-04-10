s = input()

cnt = len(s)
result = True

for i in range(cnt // 2):

    c1 = s[i]
    c2 = s[(cnt-1)-i]

    if c1 != c2 :
        result = False
        break

if result : print('1')
else : print('0')
