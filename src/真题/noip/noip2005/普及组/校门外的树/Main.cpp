// https://www.luogu.com.cn/problem/P1047
#include <iostream>

using namespace std;
int arr[10001];
int main() {
  int l, m;
  cin >> l >> m;
  int sum = l + 1;
  for (int i = 0; i < m; i++) {
    int a, b;
    cin >> a >> b;
    for (int j = a; j <= b; j++) {
      if (arr[j] == 1)
        continue;
      arr[j] = 1;
      sum--;
    }
  }
  cout << sum << endl;
  return 0;
}