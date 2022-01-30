// https://www.luogu.com.cn/problem/P1706
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n + 10];
  for (int i = 1; i <= n; i++) ls[i] = i;
  do {
    for (int i = 1; i <= n; i++) printf("%5d", ls[i]);
    cout << endl;
  } while (next_permutation(ls + 1, ls + n + 1));

  return 0;
}