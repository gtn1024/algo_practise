# https://www.luogu.com.cn/problem/P1319
ls = list(map(int, input().split()))
n = ls.pop(0)
flag = 0
for i in range(0, len(ls)):
    for j in range(ls[i]):
        print('0' if i % 2 == 0 else '1', end='')
        flag += 1
        if flag % n == 0:
            print()
