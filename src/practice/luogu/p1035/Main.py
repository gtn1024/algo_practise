# https://www.luogu.com.cn/problem/P1035

k = int(input())
s = 0
n = 0
while True:
    if s > k:
        break
    n += 1
    s += 1.0 / n
print(n)
