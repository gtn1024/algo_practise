// https://www.luogu.com.cn/problem/P5015
#include <bits/stdc++.h>

using namespace std;

int main() {
  string s;
  int i = 0;
  while (cin >> s) {
    i += s.length();
  }
  cout << i << endl;
  return 0;
}
