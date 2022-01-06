# https://www.luogu.com.cn/problem/P1009


def f(i):
    if i <= 1:
        return 1
    return f(i - 1) * i


n = int(input())
res = 0
for i in range(1, n + 1):
    res += f(i)

print(res)