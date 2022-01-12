// https://www.luogu.com.cn/problem/P1152
#include <iostream>
#include <set>

using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n];
  set<int> s;
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
    if (i != 0) {
      s.insert(abs(ls[i] - ls[i - 1]));
    }
  }
  for (int i = 1; i <= n - 1; i++) {
    if (s.find(i) == s.end()) {
      cout << "Not jolly" << endl;
      return 0;
    }
  }
  cout << "Jolly" << endl;
  return 0;
}