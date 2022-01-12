// https://www.luogu.com.cn/problem/P1601
#include <bits/stdc++.h>
using namespace std;
#define max_n 520
int a[max_n], b[max_n], c[max_n];
int main() {
  string A, B;
  cin >> A >> B;
  int len = max(A.length(), B.length());
  for (int i = A.length() - 1, j = 1; i >= 0; i--, j++) {
    a[j] = A[i] - '0';
  }
  for (int i = B.length() - 1, j = 1; i >= 0; i--, j++) {
    b[j] = B[i] - '0';
  }
  for (int i = 1; i <= len; i++) {
    c[i] += a[i] + b[i];
    c[i + 1] += c[i] / 10;
    c[i] = c[i] % 10;
  }
  if (c[len + 1]) {
    len++;
  }
  for (int i = len; i >= 1; i--) {
    cout << c[i];
  }
  cout << endl;
  return 0;
}