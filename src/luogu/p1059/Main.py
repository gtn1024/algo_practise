# https://www.luogu.com.cn/problem/P1059
n = int(input())
s = set(map(int, input().split()))
print(len(s))
ls = list(s)
ls.sort()
for i in ls:
    print(i, end=' ')