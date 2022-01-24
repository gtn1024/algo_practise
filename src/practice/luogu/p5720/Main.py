# https://www.luogu.com.cn/problem/P5720
n = int(input())
i = 1
while n > 1:
    n = int(n / 2)
    i += 1
print(i)