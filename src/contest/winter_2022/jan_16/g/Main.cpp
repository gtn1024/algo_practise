#include <bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n];
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
  }
  sort(ls, ls + n);
  int l = (n >> 1) - 1;
  int r = n - 1;
  int cnt = n;
  while (l >= 0) {
    if (ls[r] >= ls[l] * 2) {
      l--, r--;
      cnt--;
    } else {
      l--;
    }
  }
  cout << cnt << endl;
  return 0;
}