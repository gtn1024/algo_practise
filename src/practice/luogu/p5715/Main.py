# https://www.luogu.com.cn/problem/P5715

s = input().split()
a = int(s[0])
b = int(s[1])
c = int(s[2])
if a > b:
    tmp = a
    a = b
    b = tmp
if a > c:
    tmp = a
    a = c
    c = tmp
if b > c:
    tmp = b
    b = c
    c = tmp
print(str(a) + ' ' + str(b) + ' ' + str(c))
