#include <bits/stdc++.h>
using namespace std;

int a[200010];
int b[200010];
int res[200010];
int main() {
  int r;
  cin >> r;
  string sa;
  string sb;
  cin >> sa;
  cin >> sb;
  for (int i = sa.length() - 1, j = 1; i >= 0; i--, j++) {
    a[j] = (int)(sa[i] - '0');
  }
  for (int i = sb.length() - 1, j = 1; i >= 0; i--, j++) {
    b[j] = (int)(sb[i] - '0');
  }
  int len = max(sa.length(), sb.length());
  for (int i = 1; i <= len; i++) {
    res[i] += a[i] + b[i];
    if (res[i] >= r) {
      res[i + 1] = res[i] / r;
      res[i] %= r;
    }
  }
  for (int i = len + 1; i > 0; i--) {
    if (i == len + 1 && res[i] == 0) continue;
    printf("%d", res[i]);
  }
  printf("\n");
  return 0;
}
