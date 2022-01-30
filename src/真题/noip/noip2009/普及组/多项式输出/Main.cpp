// https://www.luogu.com.cn/problem/P1067
#include <cstdio>
#include <iostream>
using namespace std;
int main() {
  int n;
  cin >> n;
  bool flag = false;
  for (int i = n; i >= 0; i--) {
    int tmp;
    cin >> tmp;
    if (tmp == 0)
      continue;
    if (i == 0) {
      if (tmp > 0) {
        printf("+%i", tmp);
      } else if (tmp < 0) {
        printf("%i", tmp);
      }
      continue;
    }
    if (!flag) {
      // 输出第一项
      if (tmp == 1) {
        // ignore
      } else if (tmp == -1) {
        printf("-");
      } else {
        printf("%i", tmp);
      }
      flag = true;
    } else {
      // 非第一项
      if (tmp > 0) {
        printf("+");
        if (tmp != 1) {
          printf("%i", tmp);
        }
      } else {
        if (tmp == -1) {
          printf("-");
        } else {
          printf("%i", tmp);
        }
      }
    }
    if (i != 0) {
      if (i == 1) {
        printf("x");
      } else {
        printf("x^%i", i);
      }
    }
  }
  printf("\n");
  return 0;
}