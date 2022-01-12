// https://www.luogu.com.cn/problem/P1303
#include <bits/stdc++.h>
#define max_n 5010
using namespace std;
int a[max_n], b[max_n], c[max_n];
int main() {
  string A, B;
  cin >> A >> B;
  int len_a = A.length();
  int len_b = B.length();
  for (int i = len_a - 1, j = 1; i >= 0; i--, j++) {
    a[j] = A[i] - '0';
  }
  for (int i = len_b - 1, j = 1; i >= 0; i--, j++) {
    b[j] = B[i] - '0';
  }
  for (int i = 1; i <= len_a; i++) {
    for (int j = 1; j <= len_b; j++) {
      c[i + j - 1] += a[i] * b[j];
    }
  }
  int len = len_a + len_b;
  for (int i = 1; i <= len; i++) {
    c[i + 1] += c[i] / 10;
    c[i] = c[i] % 10;
  }
  while (!c[len]) {
    len--;
  }
  for (int i = max(1, len); i >= 1; i--) {
    cout << c[i];
  }
  cout << endl;
  return 0;
}
