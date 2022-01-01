// https://www.luogu.com.cn/problem/P5734
#include <bits/stdc++.h>

using namespace std;

int main() {
  int n;
  string s;
  cin >> n;
  cin >> s;
  for (int i = 0; i < n; i++) {
    int o;
    cin >> o;
    string ss;
    int a, b;
    switch (o) {
    case 1:
      cin >> ss;
      s.append(ss);
      cout << s << endl;
      break;

    case 2:
      cin >> a >> b;
      s = s.substr(a, b);
      cout << s << endl;
      break;

    case 3:
      cin >> a >> ss;
      s = s.insert(a, ss);
      cout << s << endl;
      break;

    case 4:
      cin >> ss;
      int t = s.find(ss);
      if (t < 100 && t >= 0)
        cout << t << endl;
      else
        cout << -1 << endl;
      // cout << (t < 100 && t >= 0) ? t : -1 << endl;
      break;
    }
  }
  return 0;
}