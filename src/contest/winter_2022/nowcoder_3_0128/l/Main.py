(N, M) = list(map(int, input().split()))
s = input().split()
ls = list()
for i in range(N):
  ls.append(list(map(int, input().split())))
names = input().split('BY ')[1][:-1].split(',')
ins = list()
for ss in names:
  for tt in range(len(s)):
    if (s[tt] == ss):
      ins.append(tt)
m = dict()
for i in range(N):
  row = ls[i]
  hsh = ''
  # 使用 Hash 会 TLE
  # for j in ins:
  #   hsh += row[j] * (31**j)
  # hsh = str(hsh)
  for j in ins:
    hsh += str(row[j]) + '-'
  if hsh not in m.keys():
    m[hsh] = 0
  m[hsh] += 1
print(len(m))
for i in m.keys():
  print(m[i], end=' ')