# https://www.luogu.com.cn/problem/P1125
def is_prime(i: int):
  if i < 2:
    return False
  j = 2
  while True:
    if j * j > i:
      break
    if i % j == 0:
      return False
  return True


s = input()
dc = dict()
for c in s:
  if c not in dc.keys():
    dc[c] = 0
  dc[c] += 1
maxn = -1
minn = 120
for v in dc.values():
  maxn = max(maxn, v)
  minn = min(minn, v)
if is_prime(maxn - minn):
  print('Lucky Word')
  print(maxn - minn)
else:
  print('No Answer')
  print(0)