# https://www.luogu.com.cn/problem/P1047
(l, m) = list(map(int, input().split()))
arr = [0] * (l + 1)
sum = l + 1
for i in range(m):
    (a, b) = list(map(int, input().split()))
    for j in range(a, b + 1):
        if arr[j] == 1:
            continue
        arr[j] = 1
        sum -= 1
print(sum)