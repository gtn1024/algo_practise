# https://www.luogu.com.cn/problem/P1425
s = input().split()
a = int(s[0])
b = int(s[1])
c = int(s[2])
d = int(s[3])

h = c - a - 1
m = (60 - b) + d

if m >= 60:
    m -= 60
    h += 1

print(str(h) + ' ' + str(m))
