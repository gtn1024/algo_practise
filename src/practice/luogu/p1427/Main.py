# https://www.luogu.com.cn/problem/P1427

s = input().split()
for i in range(len(s) - 1, -1, -1):
    if s[i] == '0':
        continue
    print(s[i], end=' ')
