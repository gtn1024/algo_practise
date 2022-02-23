#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

int T, n, k, a[100000010];
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cin >> T;
  while (T--) {
    cin >> n >> k;
    for (int i = 0; i < n; ++i) {
      cin >> a[i];
    }
    nth_element(a, a + k - 1, a + n);
    cout << a[k - 1] << endl;
  }
  return 0;
}