# https://www.luogu.com.cn/problem/P1200
a = input()
b = input()
a_s = 1
b_s = 1
for i in a:
    a_s *= ord(i) - 64
for i in b:
    b_s *= ord(i) - 64
print("GO" if a_s % 47 == b_s % 47 else "STAY")
