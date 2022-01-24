# https://www.luogu.com.cn/problem/P1104
class P:

  def __init__(self, id, name, y, m, d):
    self.id = id
    self.name = name
    self.y = y
    self.m = m
    self.d = d

  def __lt__(self, other):
    if self.y < other.y:
      return True
    elif self.y > other.y:
      return False
    else:
      if self.m < other.m:
        return True
      elif self.m > other.m:
        return False
      else:
        if self.d < other.d:
          return True
        elif self.d > other.d:
          return False
        else:
          if self.id < other.id:
            return False
          elif self.id > other.id:
            return True


n = int(input())
ls = list()
for i in range(n):
  s = input().split()
  _name = s[0]
  _y = int(s[1])
  _m = int(s[2])
  _d = int(s[3])
  ls.append(P(i, _name, _y, _m, _d))
ls.sort()
for i in ls:
  print(i.name)