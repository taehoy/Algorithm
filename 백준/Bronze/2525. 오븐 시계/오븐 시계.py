a , b = map(int, input().split())
c = int(input())

addHour = (b + c) // 60
minute = (b+c) % 60

hour = (a + addHour) % 24

print(hour, minute)