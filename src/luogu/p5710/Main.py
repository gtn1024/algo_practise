# https://www.luogu.com.cn/problem/P5710
def a(i):
    return i % 2 == 0


def b(i):
    return 4 < i <= 12


i = int(input())
print('1' if a(i) and b(i) else '0', end=' ')
print('1' if a(i) or b(i) else '0', end=' ')
print('1' if (a(i) and not b(i)) or (not a(i) and b(i)) else '0', end=' ')
print('1' if not a(i) and not b(i) else '0')
