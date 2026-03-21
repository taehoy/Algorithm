a, b, c = map(int, input().split())
d = int(input())

addMinute = (c+d) // 60
second = (c+d) % 60

addHour = (b+addMinute) // 60
minute = (b + addMinute) % 60

hour = (a+addHour) % 24

print(hour, minute, second)