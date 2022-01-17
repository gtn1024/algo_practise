# https://www.luogu.com.cn/problem/P1093
class stu:

  def __init__(self, id, chi, mat, eng):
    self.id = id
    self.chi = chi
    self.mat = mat
    self.eng = eng
    self.sum = chi + mat + eng

  def __lt__(self, other):
    if (self.sum > other.sum):
      return True
    elif (self.sum < other.sum):
      return False
    else:
      if (self.chi > other.chi):
        return True
      elif (self.chi < other.chi):
        return False
      else:
        if (self.id < other.id):
          return True
        else:
          return False


n = int(input())
ls = list()
for i in range(n):
  (_chi, _mat, _eng) = list(map(int, input().split()))
  _id = i + 1
  ls.append(stu(_id, _chi, _mat, _eng))
ls.sort()
for i in range(5):
  print(f"{ls[i].id} {ls[i].sum}")