V = int(input())
s = input()

cntA = s.count('A')
cntB = V - cntA

if cntA > cntB : print('A')
elif cntA < cntB : print('B')
else : print('Tie')