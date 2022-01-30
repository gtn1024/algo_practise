// https://ac.nowcoder.com/acm/problem/16422
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n, q;
  cin >> n >> q;
  int books[n];
  for (int i = 0; i < n; i++) cin >> books[i];
  sort(books, books + n);
  while (q--) {
    int t, m;
    cin >> t >> m;
    int pp = (int)pow(10, t);
    bool flag = false;
    for (auto &&i : books) {
      if (i == m) {
        cout << i << endl;
        flag = true;
        break;
      }
      int p = i % pp;
      if (p == m) {
        cout << i << endl;
        flag = true;
        break;
      }
    }
    if (!flag) cout << -1 << endl;
  }
  return 0;
}