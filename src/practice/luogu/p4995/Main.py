n = int(input())
ls = list(map(int, input().split()))
visited = [False for i in range(n)]
ls.sort()
last = 0
sum = 0
for i in range(int((n + 1) / 2 + 1)):
  if not visited[n - i - 1]:
    sum += (ls[n - i - 1] - last) * (ls[n - i - 1] - last)
    last = ls[n - i - 1]
    visited[n - i - 1] = True
  if not visited[i]:
    sum += (ls[i] - last) * (ls[i] - last)
    last = ls[i]
    visited[i] = True
print(sum)