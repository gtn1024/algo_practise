# https://www.luogu.com.cn/problem/P5707

import math

ss = input().split()
s = int(ss[0])
v = int(ss[1])
time = 10 + math.ceil(s / v)
h = 7
m = 60
h -= int(time / 60)
m -= time % 60
while h < 0:
    h += 24
print(('0' + str(h) if h < 10 else str(h)) + ':' +
      ('0' + str(m) if m < 10 else str(m)))
