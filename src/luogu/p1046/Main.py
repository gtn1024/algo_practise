# https://www.luogu.com.cn/problem/P1046
a = list(map(int, input().split()))
max = int(input()) + 30
count = 0
for i in range(10):
    if max >= a[i]:
        count += 1
print(count)