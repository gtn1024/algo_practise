# https://codeforces.com/problemset/problem/9/A
def gcd(a, b):
  if (b == 0):
    return a
  return gcd(b, a % b)


(y, w) = list(map(int, input().split()))
max = max(y, w)
if (max == 1):
  print('1/1')
  exit()
c = 7 - max
d = gcd(c, 6)
print(f"{int(c/d)}/{int(6/d)}")
