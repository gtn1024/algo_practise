#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;
int n, cu;
ll ma, th;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  for (int i = 0; i < n; ++i) {
    cin >> cu;
    th += cu;
    ma = max(ma, th);
    if (th < 0) th = 0;
  }
  cout << ma;

  return 0;
}