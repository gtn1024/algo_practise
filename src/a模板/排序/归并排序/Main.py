a = list()
b = []


def m(l: int, mid: int, r: int):
  pos_a = l
  pos_b = mid + 1
  for i in range(l, r + 1):
    if pos_b > r or (pos_a <= mid and a[pos_a] <= a[pos_b]):
      b[i] = a[pos_a]
      pos_a += 1
    else:
      b[i] = a[pos_b]
      pos_b += 1
  for i in range(l, r + 1):
    a[i] = b[i]


def ms(l: int, r: int):
  if l == r:
    return
  mid = (l + r) // 2
  ms(l, mid)
  ms(mid + 1, r)
  m(l, mid, r)


if __name__ == '__main__':
  n = int(input())
  a = list(map(int, input().split()))
  b = [0] * len(a)
  ms(0, len(a) - 1)
  for i in a:
    print(i, end=' ')
  print()
