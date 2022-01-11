// https://www.luogu.com.cn/problem/P1271
#include <iostream>
using namespace std;
int p[1000];
int main() {
  int n, m;
  cin >> n >> m;
  for (int i = 0; i < m; i++) {
    int tmp;
    cin >> tmp;
    p[tmp]++;
  }
  for (int i = 1; i <= n; i++) {
    if (p[i] == 0)
      continue;
    for (int j = 0; j < p[i]; j++) {
      cout << i << " ";
    }
  }
  cout << endl;
  return 0;
}