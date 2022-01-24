// https://www.luogu.com.cn/problem/P2141

#include <bits/stdc++.h>

using namespace std;
int main() {
  int n;
  scanf("%i", &n);
  vector<int> ls;
  for (int i = 0; i < n; i++) {
    int tmp;
    scanf("%i", &tmp);
    ls.push_back(tmp);
  }
  set<int> s;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (i == j)
        continue;
      if (find(ls.begin(), ls.end(), ls.at(i) + ls.at(j)) != ls.end()) {
        s.insert(ls.at(i) + ls.at(j));
      }
    }
  }
  cout << s.size() << endl;
  return 0;
}