// https://www.luogu.com.cn/problem/P5733
#include <bits/stdc++.h>

using namespace std;

int main() {
  string s;
  cin >> s;
  for (int i = 0; i < s.length(); i++) {
    if (s[i] >= 'a' && s[i] <= 'z')
      s[i] -= 32;
    printf("%c", s[i]);
  }
  printf("\n");
  return 0;
}