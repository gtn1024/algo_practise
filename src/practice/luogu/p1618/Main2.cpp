// https://www.luogu.com.cn/problem/P1618
#include <bits/stdc++.h>
using namespace std;
int main() {
  int a, b, c, cnt = 0;
  cin >> a >> b >> c;
  int ls[10];
  for (int i = 1; i < 10; i++) ls[i] = i;
  do {
    int x = ls[1] * 100 + ls[2] * 10 + ls[3];
    int y = ls[4] * 100 + ls[5] * 10 + ls[6];
    int z = ls[7] * 100 + ls[8] * 10 + ls[9];
    if (x * b == y * a && y * c == z * b) {
      cnt++;
      cout << x << ' ' << y << ' ' << z << endl;
    }
  } while (next_permutation(ls + 1, ls + 10));
  if (!cnt) cout << "No!!!";
  return 0;
}