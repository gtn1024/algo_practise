#include <algorithm>
#include <ios>
#include <iostream>
#include <string>
#define endl '\n'
typedef long long ll;
using namespace std;

const ll MOD = 1e9 + 7;

string s;
ll cnt, lft;
ll ans = 1;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> s;
  for (int i = 0; i < s.length(); ++i) {
    if (s[i] == '(') {
      lft++;
    } else if (s[i] == ')') {
      lft--;
      if (lft < 0) {
        cout << -1 << endl;  // 左括号数小于右括号数
        return 0;
      } else if (lft == 0) {  // 剩余左括号为 0，切割点增加
        cnt++;
      }
    }
  }

  if (lft != 0) {
    cout << -1 << endl;
    return 0;
  }

  for (int i = 0; i < cnt - 1; ++i) ans = ans * 2 % MOD;
  cout << ans % MOD << endl;

  return 0;
}
