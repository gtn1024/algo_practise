// https://www.luogu.com.cn/problem/P1200
#include <bits/stdc++.h>

using namespace std;

int main() {
  string a, b;
  cin >> a >> b;
  int a_s = 1;
  int b_s = 1;
  for (int i = 0; i < a.length(); i++) {
    a_s *= (int)(a[i] - 64);
  }
  for (int i = 0; i < b.length(); i++) {
    b_s *= (int)(b[i] - 64);
  }
  printf("%s\n", a_s % 47 == b_s % 47 ? "GO" : "STAY");
  return 0;
}