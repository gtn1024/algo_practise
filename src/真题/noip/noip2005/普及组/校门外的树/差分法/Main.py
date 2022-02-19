l, m = map(int, input().split())
diff = [0] * 10010
for i in range(m):
  a, b = map(int, input().split())
  if a > b:
    a, b = b, a
  diff[a] += 1
  diff[b + 1] -= 1
cur = 0
cnt = 0
for i in range(l + 1):
  cur += diff[i]
  if cur == 0:
    cnt += 1
print(cnt)