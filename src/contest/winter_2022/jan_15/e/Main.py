# https://www.51nod.com/Challenge/Problem.html#problemId=3199
n = int(input())
ls = list()
for i in range(n):
    s = list(map(int, input().split()))
    if s[0] == 1:
        ls.append(s[1])
    elif s[0] == 2:
        if (len(ls) == 0):
            print('empty')
        else:
            print(ls.pop())
