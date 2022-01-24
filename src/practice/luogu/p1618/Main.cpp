// https://www.luogu.com.cn/problem/P1618
#include <bits/stdc++.h>
using namespace std;
int main() {
  int A, B, C;
  cin >> A >> B >> C;
  bool flag = false;
  for (int i = 1; i <= 1000 / C; i++) {
    int a = A * i;
    int b = B * i;
    int c = C * i;
    set<int> s;
    s.insert(a / 100);
    s.insert((a % 100) / 10);
    s.insert(a % 10);
    s.insert(b / 100);
    s.insert((b % 100) / 10);
    s.insert(b % 10);
    s.insert(c / 100);
    s.insert((c % 100) / 10);
    s.insert(c % 10);
    if (find(s.begin(), s.end(), 0) != s.end()) {
      // 含有 0
      continue;
    }
    if (s.size() == 9) {
      flag = true;
      cout << a << ' ' << b << ' ' << c << endl;
    }
  }
  if (!flag) {
    cout << "No!!!" << endl;
  }
  return 0;
}