// https://www.luogu.com.cn/problem/P1014
#include <cstdio>

int main() {
  int n;
  scanf("%i", &n);
  if (n == 1) {
    printf("%i/%i\n", 1, 1);
    return 0;
  }
  int a = 1;
  int b = 1;
  int mode = 0;
  bool locked = false;
  for (int i = 2; i <= n; i++) {
    if (a == 1 && !locked) {
      b++;
      locked = true;
      // 向左下角
      mode = 1;
      continue;
    } else if (b == 1 && !locked) {
      a++;
      locked = true;
      // 向右上角
      mode = 2;
      continue;
    }
    locked = false;
    if (mode == 1) {
      // 向左下角
      a++;
      b--;
    } else if (mode == 2) {
      // 向右上角
      a--;
      b++;
    }
  }
  printf("%i/%i\n", a, b);
  return 0;
}
