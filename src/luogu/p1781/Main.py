# https://www.luogu.com.cn/problem/P1781
n = int(input())
max = 0
ind = 0
for i in range(n):
    tmp = int(input())
    if tmp > max:
        max = tmp
        ind = i + 1
print(ind)
print(max)