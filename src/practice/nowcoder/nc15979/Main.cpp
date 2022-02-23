#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

ll t, n;
int f(ll i) {
  if (i == 0) return 0;
  if (i == 1) return 1;
  return f(i >> 1) + i % 2;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cin >> t;
  while (t--) {
    cin >> n;
    ll res = f(n);
    cout << res << ' ' << (1LL << res) - 1 << endl;
  }
  return 0;
}