#include <bits/stdc++.h>
using namespace std;
int main() {
  int t;
  scanf("%d", &t);
  for (int i = 0; i < t; i++) {
    int n;
    int x = 0, y = 0;
    cin >> n;
    string s;
    cin >> s;
    double maxl = 0;
    for (int j = 0; j < n; j++) {
      char tmp = s[j];
      if (tmp == 'U') {
        y++;
      } else if (tmp == 'D') {
        y--;
      } else if (tmp == 'R') {
        x++;
      } else if (tmp == 'L') {
        x--;
      }
      double l = sqrt(x * x + y * y);
      maxl = max(l, maxl);
    }
    printf("%lf\n", maxl);
  }
  return 0;
}