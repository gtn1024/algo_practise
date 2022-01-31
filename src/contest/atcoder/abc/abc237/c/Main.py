def deter(s):
  return s == ''.join(reversed(s))


s = input()
l = 0
r = 0
for i in range(len(s)):
  if s[i] == 'a':
    l += 1
  else:
    break

for i in range(len(s) - 1, -1, -1):
  if s[i] == 'a':
    r += 1
  else:
    break

if r >= l and deter((r - l) * 'a' + s):
  print('Yes')
else:
  print('No')
