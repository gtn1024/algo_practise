#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

ll a[10];
ll ans;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  for (int i = 1; i <= 8; ++i) cin >> a[i];
  for (int i = 1; i <= 8; ++i) {
    if (a[i] == 1 || a[i] == 2) {
      continue;
    } else if (a[i] == 5) {
      a[i + 1] += 1;
      ans += i * 4;
    } else {
      ans += i * a[i];
      a[i + 1] += a[i] / 3;
    }
  }
  cout << ans << endl;

  return 0;
}
