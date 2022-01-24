// https://www.luogu.com.cn/problem/P1125
#include <cmath>
#include <iostream>
#include <map>
using namespace std;
bool isPrime(int i) {
  if (i < 2) return false;
  for (int j = 2; j < i / 2 + 1; j++) {
    if (i % j == 0) {
      return false;
    }
  }
  return true;
}
int main() {
  string s;
  cin >> s;
  map<char, int> m;
  int maxn = -1;
  int minn = 120;
  for (int i = 0; i < s.length(); ++i) {
    m[s[i]]++;
  }
  for (auto &&i : m) {
    maxn = max(maxn, i.second);
    minn = min(minn, i.second);
  }
  if (isPrime(maxn - minn)) {
    cout << "Lucky Word" << endl;
    cout << maxn - minn << endl;
  } else {
    cout << "No Answer" << endl;
    cout << 0 << endl;
  }
  return 0;
}