// https://www.luogu.com.cn/problem/P1068
#include <bits/stdc++.h>
using namespace std;
typedef struct {
  int k, s;
} c;
int main() {
  int n, m;
  cin >> n >> m;
  c ps[n];
  for (int i = 0; i < n; i++) {
    cin >> ps[i].k >> ps[i].s;
  }
  int t = min((int)(m * 1.5), n);
  sort(ps, ps + n, [](c a, c b) {
    if (a.s > b.s) {
      return true;
    } else if (a.s < b.s) {
      return false;
    } else {
      return a.k < b.k;
    }
  });
  int act = 0;
  for (int i = 0; i < n; i++) {
    if (i < t || (i < n - 1 && ps[i].s == ps[i - 1].s)) {
      act++;
    } else {
      break;
    }
  }
  cout << ps[act - 1].s << ' ' << act << endl;
  for (int i = 0; i < act; i++) {
    cout << ps[i].k << ' ' << ps[i].s << endl;
  }
  return 0;
}