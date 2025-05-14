# 25.05.14(수) 
arr = [int(input()) for _ in range(9)]

max_num = max(arr)
max_index = arr.index(max_num)
print(max_num)
print(max_index + 1)