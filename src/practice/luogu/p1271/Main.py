# https://www.luogu.com.cn/problem/P1271
(n, m) = list(map(int, input().split()))
p = [0 for i in range(n + 1)]
t = list(map(int, input().split()))
for i in t:
    p[i] += 1
for i in range(len(p)):
    if p[i] == 0:
        continue
    for j in range(p[i]):
        print(i, end=' ')
print()
