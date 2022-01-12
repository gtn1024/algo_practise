# https://www.luogu.com.cn/problem/P1152
ls = list(map(int, input().split()))
n = ls[0]
ls = ls[1:]
s = set()
for i in range(n - 1):
    s.add(abs(ls[i] - ls[i + 1]))
for i in range(1, n):
    if i not in s:
        print("Not jolly")
        exit()
print("Jolly")