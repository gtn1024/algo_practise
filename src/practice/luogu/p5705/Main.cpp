// https://www.luogu.com.cn/problem/P5705
#include <cstdio>
#include <iostream>
#include <string>

using namespace std;

int main() {
  string s;
  cin >> s;
  for (int i = s.length() - 1; i >= 0; i--) {
    printf("%c", s[i]);
  }
  printf("\n");
  return 0;
}