// https://www.51nod.com/Challenge/Problem.html#problemId=3056
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n, k;
  cin >> n >> k;
  vector<int> ls;
  for (int i = 0; i < n; i++) {
    int tmp;
    cin >> tmp;
    ls.push_back(tmp);
  }
  ls.resize(n);
  for (int i = 0; i < k; i++) {
    char o;
    cin >> o;
    int x, y;
    switch (o) {
      case 'Z':
        cin >> x >> y;
        if (x > ls.size()) {
          ls.push_back(y);
        } else {
          ls.insert(ls.begin() + x, y);
        }
        break;
      case 'D':
        cin >> x;
        if (x >= ls.size())
          continue;
        ls.erase(ls.begin() + x);
        break;
    }
  }
  cout << ls.size() << endl;
  for (int i = 0; i < ls.size(); i++) {
    cout << ls[i] << " ";
  }
  return 0;
}
