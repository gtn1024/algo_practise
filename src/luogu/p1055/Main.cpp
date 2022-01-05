// https://www.luogu.com.cn/problem/P1055
#include <bits/stdc++.h>
using namespace std;
int main() {
  string s;
  cin >> s;
  int ls[10];
  for (int i = 0, j = 0; i < s.length(); i++) {
    if (s[i] == '-')
      continue;
    ls[j] = s[i] == 'X' ? 10 : s[i] - 48;
    j++;
  }

  int res = 0;
  for (int i = 1; i <= 9; i++) {
    res += ls[i - 1] * i;
  }
  int result = res % 11;
  if (ls[9] == result) {
    printf("Right\n");
  } else {
    printf("%i-", ls[0]);
    for (int i = 1; i <= 3; i++) {
      printf("%i", ls[i]);
    }
    printf("-");
    for (int i = 4; i <= 8; i++) {
      printf("%i", ls[i]);
    }
    printf("-");
    if (result == 10)
      printf("X\n");
    else
      printf("%i\n", result);
  }
  return 0;
}
