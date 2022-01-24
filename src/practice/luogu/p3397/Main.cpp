// https://www.luogu.com.cn/problem/P3397
#include <bits/stdc++.h>
using namespace std;

int arr[1001][1001];

int main() {
  int n, m;
  cin >> n >> m;

  for (int i = 0; i < m; i++) {
    int a, b, c, d;
    cin >> a >> b >> c >> d;
    for (int j = a; j <= c; j++) {
      for (int j2 = b; j2 <= d; j2++) {
        arr[j - 1][j2 - 1]++;
      }
    }
  }

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      cout << arr[i][j] << " ";
    }
    cout << endl;
  }

  return 0;
}