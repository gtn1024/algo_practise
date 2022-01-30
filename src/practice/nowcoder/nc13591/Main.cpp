// https://ac.nowcoder.com/acm/problem/13591
#include <bits/stdc++.h>
using namespace std;
int n, m;
int main() {
  while (cin >> n >> m) {
    int cnt = 0;
    int x[n];
    for (int i = 0; i < n; i++) cin >> x[i];
    sort(x, x + n);
    for (int i = 0; i < n - 1;) {
      if (x[i + 1] - x[i] < m) {
        cnt++;
        i += 2;
      } else {
        i += 1;
      }
    }
    cout << cnt << endl;
  }
  return 0;
}