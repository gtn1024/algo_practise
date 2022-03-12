#include <bits/stdc++.h>
#define endl '\n'
typedef long long ll;
using namespace std;

int n;
int a[110];

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  for (int i = 1; i <= n; ++i) cin >> a[i];
  for (int i = 1; i <= n; ++i) {
    for (int j = i + 1; j <= n; ++j) {
      if ((a[i] - a[j]) % 2 == 0 && a[i] > a[j]) swap(a[i], a[j]);
    }
  }
  for (int i = 2; i <= n; ++i) {
    if (a[i - 1] > a[i]) {
      cout << "No" << endl;
      return 0;
    }
  }
  cout << "Yes" << endl;

  return 0;
}