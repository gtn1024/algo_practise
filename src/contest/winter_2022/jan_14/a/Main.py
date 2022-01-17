# https://nanti.jisuanke.com/t/T2065
n = int(input())
ng = n < 0
s = ''.join(reversed(str(abs(n))))
if ng:
    print('-', end='')
print(int(s))