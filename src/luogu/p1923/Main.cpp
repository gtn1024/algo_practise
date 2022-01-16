// https://www.luogu.com.cn/problem/P1923
#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int n, k;
  cin >> n >> k;
  int ls[n];
  for (int i = 0; i < n; ++i) {
    cin >> ls[i];
  }
  sort(ls, ls + n);
  cout << ls[k];
  return 0;
}