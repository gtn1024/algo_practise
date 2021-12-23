// https://www.luogu.com.cn/problem/P1719
#include <bits/stdc++.h>
using namespace std;

int arr[121][121];

// TODO: 4WA
int main() {
  int n, tmp;
  cin >> n;

  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
      cin >> tmp;
      arr[i][j] = arr[i - 1][j] + arr[i][j - 1] + tmp - arr[i - 1][j - 1];
    }
  }
  // cout << "----" << endl;
  int max = 0;

  // for (int i = 1; i <= n; i++) {
  //   for (int j = 1; j <= n; j++) {
  //     cout << arr[i][j] << " ";
  //   }
  //   cout << endl;
  // }

  for (int a1 = 1; a1 < n + 1; a1++) {
    for (int a2 = 1; a2 < n + 1; a2++) {
      // (a1, a2) 左上
      for (int b1 = a1 + 1; b1 < n + 1; b1++) {
        for (int b2 = a2 + 1; b2 < n + 1; b2++) {
          // (b1, b2) 右下
          tmp = arr[b1][b2] - arr[a1 - 1][b2] - arr[b1][a2 - 1];
          if (tmp > max) {
            max = tmp;
          }
        }
      }
    }
  }
  cout << max << endl;
  return 0;
}