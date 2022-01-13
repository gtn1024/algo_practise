# https://www.luogu.com.cn/problem/P2676
(n, b) = list(map(int, input().split()))
ls = list()
for i in range(n):
    ls.append(int(input()))
ls.sort()
c = 0
sum = 0
for i in range(n - 1, -1, -1):
    sum += ls[i]
    c += 1
    if sum >= b:
        break
print(c)