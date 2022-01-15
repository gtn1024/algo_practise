// https://www.51nod.com/Challenge/Problem.html#problemId=2068
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  deque<int> ls(n);
  for (int i = n; i >= 1; i--) {
    ls.push_front(i);
  }
  ls.resize(n);
  vector<int> d;
  while (ls.size() >= 2) {
    d.push_back(ls.front());
    ls.pop_front();
    int tmp = ls.front();
    ls.pop_front();
    ls.push_back(tmp);
  }
  d.push_back(ls.front());
  bool flag = false;
  for (int integer : d) {
    if (flag) {
      cout << ' ';
    } else {
      flag = true;
    }
    cout << integer;
  }
  cout << endl;
  return 0;
}