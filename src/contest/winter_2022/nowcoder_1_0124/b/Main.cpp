// TODO: TLE
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  int n, q;
  scanf("%d%d", &n, &q);
  string str;
  cin >> str;
  for (int i = 0; i < q; i++) {
    int l, r;
    ll s;  // 分数
    scanf("%d%d%lld", &l, &r, &s);
    for (int j = l; j <= r; j++) {
      char c = str[j - 1];
      if (c == 'W') {
        s++;
      } else if (c == 'L') {
        if (s % 3 != 0) s--;
      } else if (c == 'D') {
      }
    }
    printf("%lld\n", s);
  }
  return 0;
}