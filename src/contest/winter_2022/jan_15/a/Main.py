# https://www.51nod.com/Challenge/Problem.html#problemId=3056
(n, k) = list(map(int, input().split()))
ls = list(map(int, input().split()))
for i in range(k):
    s = input().split()
    if s[0] == 'Z':
        x = int(s[1])
        y = int(s[2])
        if x > len(ls):
            ls.append(y)
        else:
            ls.insert(x, y)
    elif s[0] == 'D':
        x = int(s[1])
        if (x >= len(ls)):
            continue
        del ls[x]
print(len(ls))
for i in ls:
    print(i, end=' ')
