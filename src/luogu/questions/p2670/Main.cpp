// https://www.luogu.com.cn/problem/P2670
#include <bits/stdc++.h>

using namespace std;

int arr[102][102];

int main() {
  int n, m;
  cin >> n >> m;

  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= m; j++) {
      char c;
      cin >> c;
      if (c == '*') {
        arr[i][j] = 1;
      }
    }
  }
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= m; j++) {
      if (arr[i][j] == 1) {
        printf("*");
      } else {
        printf("%i", arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] +
                         arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j - 1] +
                         arr[i + 1][j] + arr[i + 1][j + 1]);
      }
    }
    printf("\n");
  }
}