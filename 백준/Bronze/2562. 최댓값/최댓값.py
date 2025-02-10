index = 0
maxNumber = 0

numbers = []

for i in range(9):
    numbers.append(int(input()))

maxNumber = max(numbers)

for n in numbers :
    index+=1
    if maxNumber == n :
        print(maxNumber)
        print(index)
        break