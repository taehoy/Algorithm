V = int(input())
s = input()

cntA = 0
cntB = 0

for c in s:
    if c == 'A': cntA +=1
    else : cntB +=1

if cntA > cntB :
    print('A')
elif cntA < cntB :
    print('B')
else :
    print("Tie")
