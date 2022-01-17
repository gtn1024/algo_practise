# https://nanti.jisuanke.com/t/T1193
class s:

  def __init__(self, a, b, c, d):
    self.a = a
    self.b = b
    self.c = c
    self.d = d

  def __lt__(self, other):
    if (self.a < other.a):
      return True
    elif self.a > other.a:
      return False
    else:
      if (self.b < other.b):
        return True
      elif self.b > other.b:
        return False
      else:
        if (self.c < other.c):
          return True
        elif self.c > other.c:
          return False
        else:
          if (self.d < other.d):
            return True
          else:
            return False


n = int(input())
ls = list()
for b in range(1, n + 1):
  for c in range(b, n + 1):
    for d in range(c, n + 1):
      da = (b * b * b + c * c * c + d * d * d)**(1 / 3)
      ia = int(da + 1e-7)
      if abs(da - ia) < 1e-6:
        if ia > n or b > n or c > n or d > n:
          continue
        if ia <= 1 or b <= 1 or c <= 1 or d <= 1:
          continue
        ls.append(s(ia, b, c, d))
ls.sort()
for i in ls:
  # Python 3.5 不支持
  # print(f"Cube = {i.a}, Triple = ({i.b},{i.c},{i.d})")
  print("Cube = {}, Triple = ({},{},{})".format(i.a, i.b, i.c, i.d))
