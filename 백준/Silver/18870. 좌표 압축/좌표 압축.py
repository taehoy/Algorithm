n = int(input())

arr = list(map(int, input().split()))

sorted_arr = sorted(set(arr))   

dic = { num : idx for idx, num in enumerate(sorted_arr)}

print(" ".join(str(dic[num]) for num in arr))