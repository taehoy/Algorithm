n = int(input())

arr = []

for _ in range(n) :
    word = input()

    if word in arr :
        continue
    arr.append(word)

arr.sort(key=lambda x:(len(x), x))

for word in arr :
    print(word)