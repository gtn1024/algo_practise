// https://www.luogu.com.cn/problem/P1567
#include <iostream>
using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n];
  int max = 0;
  int tmp = 1;
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
    if (i != 0) {
      if (ls[i] >= ls[i - 1]) {
        tmp++;
        if (i == n - 1) {
          if (tmp > max)
            max = tmp;
        }
      } else {
        if (tmp > max)
          max = tmp;
        tmp = 1;
      }
    }
  }
  printf("%i\n", max);
  return 0;
}