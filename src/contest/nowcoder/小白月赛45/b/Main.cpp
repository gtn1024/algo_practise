#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

ll n, flg, ans;

void dfs(int cnt) {
  flg++;
  if (flg > n) return;
  for (int i = 1; i <= cnt; ++i) ans++;
  dfs(cnt + 2);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  dfs(1);
  cout << ans << endl;

  return 0;
}
