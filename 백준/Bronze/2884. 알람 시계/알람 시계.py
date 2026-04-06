h, m = map(int,input().split())

if m - 45 >= 0 :
    print(h, m-45)
else :
    # 시간
    h = h - 1
    if (h < 0) :
        h = 23
    
    # 분
    m = m + 15
    print(h,m)

