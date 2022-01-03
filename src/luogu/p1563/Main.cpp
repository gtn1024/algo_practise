// https://www.luogu.com.cn/problem/P1563
#include <bits/stdc++.h>

using namespace std;

typedef struct R {
  int cx;
  string zy;
} R;

int main() {
  int n, m;
  cin >> n >> m;
  R rs[n];
  for (int i = 0; i < n; i++) {
    cin >> rs[i].cx >> rs[i].zy;
  }
  int index = 0;
  for (int i = 0; i < m; i++) {
    int a, s;
    cin >> a >> s;
    index -= (a == 0 ? 1 : -1) * (rs[index].cx == 0 ? 1 : -1) * s;
    if (index < 0)
      index += n;
    else if (index >= n)
      index -= n;
  }
  cout << rs[index].zy << endl;
  return 0;
}