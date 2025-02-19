import sys
input = sys.stdin.readline

def fibo(N) :
    if N == 0 :
        return 0
    if N == 1 :
        return 1
    
    return fibo(N-1) + fibo(N-2)

n = int(input())
print(fibo(n))