# https://www.luogu.com.cn/problem/P1428
n = int(input())
ls = list(map(int, input().split()))
for i in range(n):
    c = 0
    for j in range(i):
        if (ls[i] > ls[j]):
            c += 1
    print(c, end=' ')
