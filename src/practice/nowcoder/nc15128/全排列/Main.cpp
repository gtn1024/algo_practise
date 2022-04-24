// https://ac.nowcoder.com/acm/problem/15128
#include <bits/stdc++.h>
using namespace std;
int main() {
  int ls[8];
  for (int i = 0; i < 8; i++) {
    ls[i] = i + 1;
  }
  do {
    for (int i = 0; i < 8; i++) {
      cout << ls[i] << ' ';
    }
    cout << endl;
  } while (next_permutation(ls, ls + 8));
  return 0;
}