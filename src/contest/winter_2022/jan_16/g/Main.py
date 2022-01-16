# https://nanti.jisuanke.com/t/A2240
n = int(input())
ls = list(map(int, input().split()))
ls.sort()
l = (n >> 1) - 1
r = n - 1
cnt = n
while l >= 0:
    if ls[r] >= ls[l] * 2:
        l -= 1
        r -= 1
        cnt -= 1
    else:
        l -= 1
print(cnt)