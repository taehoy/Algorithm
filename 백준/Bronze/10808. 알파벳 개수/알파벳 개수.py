# a-z 리스트 생성
# 단어에 맞는 인덱스 + 1
# 리스트 출력 

alphabets = [0] * 26

S = input()

for char in S :
    alphabets[ord(char)-ord('a')] += 1

# 한줄로 출력 
print(" ".join(map(str, alphabets)))