// https://www.luogu.com.cn/problem/P1012
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n];
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
  }
  sort(ls, ls + n, [](int a, int b) {
    string sa = to_string(a) + to_string(b);
    string sb = to_string(b) + to_string(b);
    return sa > sb;
  });
  for (auto&& i : ls) {
    cout << i;
  }
  return 0;
}