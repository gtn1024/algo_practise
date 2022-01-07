// https://www.luogu.com.cn/problem/P2241
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main() {
  int n, m;
  cin >> n >> m;
  ll zfx = 0, cfx = 0;
  for (ll x = 0; x <= n; x++) {
    for (ll y = 0; y <= m; y++) {
      ll t = min(x, y);
      zfx += t;
      cfx += x * y - t;
    }
  }
  cout << zfx << " " << cfx << endl;
  return 0;
}