// https://www.51nod.com/Challenge/Problem.html#problemId=3199
#include <bits/stdc++.h>
using namespace std;
int main() {
  stack<int> s;
  int n;
  cin >> n;
  for (int i = 0; i < n; i++) {
    int o;
    cin >> o;
    int tmp;
    switch (o) {
      case 1:
        cin >> tmp;
        s.push(tmp);
        break;
      case 2:
        if (s.size() == 0) {
          cout << "empty" << endl;
        } else {
          tmp = s.top();
          s.pop();
          cout << tmp << endl;
        }
        break;
    }
  }

  return 0;
}