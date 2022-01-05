# https://www.luogu.com.cn/problem/P5716
s = input().split()
y = int(s[0])
m = int(s[1])
arr = (0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
if m == 2 and ((y % 4 == 0 and y % 100 != 0) or y % 400 == 0):
    print(29)
else:
    print(arr[m])
