import sys
input = sys.stdin.readline

n = int(input())

def fibo(N) :
    if N == 0 :
        return 0
    if N == 1 :
        return 1
    
    a, b = 0 , 1
    for _ in range(2, N+1):
        a,b = b, a+b
    return b

print(fibo(n))