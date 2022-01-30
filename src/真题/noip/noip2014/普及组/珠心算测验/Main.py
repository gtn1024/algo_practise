# https://www.luogu.com.cn/problem/P2141
input()  # ignore
ls = list(map(int, input().split()))
s = set()
for i in ls:
    for j in ls:
        if i == j:
            continue
        if i + j in ls:
            s.add(i + j)
print(len(s))