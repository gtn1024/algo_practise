# https://www.luogu.com.cn/problem/P5718
n = int(input())
s = input().split()
min = 1001
for i in range(n):
    if int(s[i]) < min:
        min = int(s[i])
print(min)