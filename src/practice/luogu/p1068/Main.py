#  https://www.luogu.com.cn/problem/P1068
class P:

  def __init__(self, k, s):
    self.k = k
    self.s = s

  def __lt__(self, other):
    if self.s > other.s:
      return True
    elif self.s < other.s:
      return False
    else:
      return self.k < other.k


(n, m) = list(map(int, input().split()))
ps = list()
for i in range(n):
  (_k, _s) = list(map(int, input().split()))
  ps.append(P(_k, _s))
t = min(int(m * 1.5), n)
ps.sort()
act = 0
for i in range(n):
  if i < t or (i < n - 1 and ps[i].s == ps[i - 1].s):
    act += 1
  else:
    break
print(f"{ps[act-1].s} {act}")
for i in range(act):
  print(f"{ps[i].k} {ps[i].s}")
