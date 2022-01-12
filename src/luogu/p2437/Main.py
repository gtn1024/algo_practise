# https://www.luogu.com.cn/problem/P2437
(m, n) = list(map(int, input().split()))
f = [0 for i in range(1010)]
f[m + 1] = 1
f[m + 2] = 2

for i in range(m + 3, n + 1):
    f[i] = f[i - 1] + f[i - 2]
print(f[n])
