# a-z 리스트 생성
# 단어에 맞는 인덱스 + 1
# 리스트 출력 

result = [0] * 26
S = input()

for word in S :
    result[ord(word) - ord('a')] += 1

print(" ".join(map(str, result)))