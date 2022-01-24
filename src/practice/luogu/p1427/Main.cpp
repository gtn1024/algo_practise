// https://www.luogu.com.cn/problem/P1427
#include <bits/stdc++.h>
using namespace std;
int main() {
  vector<int> v;
  int tmp;
  while (cin >> tmp, tmp) {
    v.push_back(tmp);
  }
  for (int i = v.size() - 1; i >= 0; i--) {
    printf("%i ", v.at(i));
  }
  return 0;
}