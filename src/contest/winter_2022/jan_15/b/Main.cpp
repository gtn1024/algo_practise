// https://nanti.jisuanke.com/t/T1526
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n, m;
  cin >> n >> m;
  set<int> A;
  set<int> B;
  for (int i = 0; i < n; i++) {
    int tmp;
    cin >> tmp;
    A.insert(tmp);
  }
  for (int i = 0; i < m; i++) {
    int tmp;
    cin >> tmp;
    B.insert(tmp);
  }
  A.insert(B.begin(), B.end());
  bool flag = false;
  for (int integer : A) {
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