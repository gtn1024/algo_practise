# https://www.luogu.com.cn/problem/P1567
n = int(input())
ls = list(map(int, input().split()))
max = 0
tmp = 1
for i in range(n):
    if i == 0:
        continue
    if ls[i] >= ls[i - 1]:
        tmp += 1
        if i == n - 1:
            if tmp > max:
                max = tmp
    else:
        if tmp > max:
            max = tmp
        tmp = 1

print(max)