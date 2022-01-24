# https://www.luogu.com.cn/problem/P5713
i = int(input())
luogu = 11 + 3 * i
local = 5 * i
print('Local' if local < luogu else 'Luogu')