// https://www.luogu.com.cn/problem/P1059
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin >> n;
  set<int> s;
  int arr[n];
  int c = 0;
  for (int i = 0; i < n; i++) {
    int tmp;
    cin >> tmp;
    if (s.insert(tmp).second == true) {
      arr[c++] = tmp;
    }
  }
  sort(arr, arr + c);
  cout << s.size() << endl;
  for (int i = 0; i < c; i++) {
    cout << arr[i] << ' ';
  }
  return 0;
}