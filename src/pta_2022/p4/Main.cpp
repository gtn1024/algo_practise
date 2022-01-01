#include <bits/stdc++.h>
using namespace std;
int main(void) {
  int n;
  cin >> n;
  int a[n][4];
  int b[3][4];
  for (int i = 0; i < n; i++) {
    int p;
    cin >> p;
    a[i][0] = p / 1000;
    a[i][1] = (p % 1000) / 100;
    a[i][2] = (p % 100) / 10;
    a[i][3] = p % 10;
  }
  for (int i = 0; i < 3; i++) {
    int p;
    cin >> p;
    b[i][0] = p / 1000;
    b[i][1] = (p % 1000) / 100;
    b[i][2] = (p % 100) / 10;
    b[i][3] = p % 10;
  }

  int max = 0;
  for (int i = 0; i < n; i++) {   // a
    for (int j = 0; j < 3; j++) { // b
      if (a[i][0] == b[j][0] && a[i][1] == b[j][1] && a[i][2] == b[j][2] &&
          a[i][3] == b[j][3]) {
        max = 5;
      } else if (a[i][0] != b[j][0] && a[i][1] == b[j][1] &&
                 a[i][2] == b[j][2] && a[i][3] == b[j][3]) {
        if (max < 4) {
          max = 4;
        }
      } else if (a[i][1] == b[j][1] && a[i][2] == b[j][2] &&
                 a[i][3] == b[j][3]) {
        if (max < 3) {
          max = 3;
        }
      } else if (a[i][2] == b[j][2] && a[i][3] == b[j][3]) {
        if (max < 2) {
          max = 2;
        }
      } else if (a[i][3] != b[j][3]) {
        if (max < 1) {
          max = 1;
        }
      }
    }
  }
  if (max == 5) {
    cout << "YiDengJiang!!!";
  } else if (max == 4) {
    cout << "ErDengJiang";
  } else if (max == 3) {
    cout << "SanDengJiang";
  } else if (max == 2) {
    cout << "SiDengJiang";
  } else if (max == 1) {
    cout << "WuDengJiang";
  }
}