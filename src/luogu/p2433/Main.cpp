// https://www.luogu.com.cn/problem/P2433
#include <bits/stdc++.h>

using namespace std;

int main() {
  int T;
  cin >> T;
  if (T == 1) {
    cout << "I love Luogu!";
  } else if (T == 2) {
    cout << 2 + 4 << " " << 10 - 2 - 4;
  } else if (T == 3) {
    int i = 0;
    while (4 * (i + 1) <= 14)
      i++;
    cout << i << endl << 4 * i << endl << 14 - 4 * i << endl;
  } else if (T == 4) {
    printf("%3.3lf", (500.0 / 3));
  } else if (T == 5) {
    cout << (260 + 220) / (12 + 20);
  } else if (T == 6) {
    cout << sqrt(6 * 6 + 9 * 9);
  } else if (T == 7) {
    int i = 100;
    i += 10;
    cout << i << endl;
    i -= 20;
    cout << i << endl;
    i = 0;
    cout << i << endl;
  } else if (T == 8) {
    int r = 5;
    const double pi = 3.141593;
    cout << 2 * pi * r << endl;
    cout << pi * r * r << endl;
    cout << 4.0 / 3 * pi * r * r * r << endl;
  } else if (T == 9) {
    int sum = 1;
    for (int i = 0; i < 3; i++) {
      sum = (sum + 1) * 2;
    }
    cout << sum;
  } else if (T == 10) {
    cout << 9;
  } else if (T == 11) {
    cout << 100.0 / (8 - 5);
  } else if (T == 12) {
    cout << (int)('M' - 'A' + 1) << endl;
    cout << (char)('A' + 17) << endl;
  } else if (T == 13) {
    const double pi = 3.141593;
    cout << 16 << endl;
  } else if (T == 14) {
    cout << 50;
  }
  return 0;
}