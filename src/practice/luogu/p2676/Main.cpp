// https://www.luogu.com.cn/problem/P2676
#include <algorithm>
#include <iostream>
using namespace std;
int main() {
  int n, b;
  cin >> n >> b;
  int ls[n];
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
  }
  sort(ls, ls + n);
  int c = 0;
  int sum = 0;
  for (int i = n - 1; i >= 0; i--) {
    sum += ls[i];
    c++;
    if (sum >= b) {
      printf("%i\n", c);
      break;
    }
  }

  return 0;
}