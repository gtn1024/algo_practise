# https://www.luogu.com.cn/problem/P1085
max_time = 0
max_day = 0
for i in range(1, 8):
    s = input().split()
    tmp = int(s[0]) + int(s[1])
    if tmp > 8 and tmp > max_time:
        max_time = tmp
        max_day = i
print(max_day)
