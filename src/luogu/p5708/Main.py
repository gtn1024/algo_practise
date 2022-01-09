# https://www.luogu.com.cn/problem/P5708
import math
(a, b, c) = list(map(float, input().split()))
p = (a + b + c) / 2
print('%.1f' % math.sqrt(p * (p - a) * (p - b) * (p - c)))
