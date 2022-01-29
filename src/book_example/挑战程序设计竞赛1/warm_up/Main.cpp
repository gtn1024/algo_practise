#include <iostream>
using namespace std;
int a[110];
int main() {
  int n;
  cin >> n;
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }
  int ans = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      for (int k = j + 1; k < n; k++) {
        int len = a[i] + a[j] + a[k];
        int ma = max(a[i], max(a[j], a[k]));
        int re = len - ma;

        if (ma < re) {
          ans = max(ans, len);
        }
      }
    }
  }
  cout << ans << endl;
  return 0;
}