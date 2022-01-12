# https://www.luogu.com.cn/problem/P1255
n = int(input())
f = [0 for i in range(5010)]
f[1] = 1
f[2] = 2
for i in range(3, n + 1):
    f[i] = f[i - 1] + f[i - 2]
print(f[n])
