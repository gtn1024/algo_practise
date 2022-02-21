// https://ac.nowcoder.com/acm/problem/24636
#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
int l, m, cnt, cur;
int diff[100000010];
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> l >> m;
  while (m--) {
    int a, b;
    cin >> a >> b;
    if (a > b) swap(a, b);
    diff[a]++;
    diff[b + 1]--;
  }
  for (int i = 0; i <= l; ++i) {
    // 通过差分获取当前元素
    cur += diff[i];
    if (cur == 0) cnt++;
  }
  cout << cnt << endl;
  return 0;
}