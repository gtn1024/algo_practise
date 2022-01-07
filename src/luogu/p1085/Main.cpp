// https://www.luogu.com.cn/problem/P1085
#include <cstdio>

int main() {
  int max_time = 0;
  int max_day = 0;
  for (int i = 1; i <= 7; i++) {
    int a, b;
    scanf("%i%i", &a, &b);
    if (a + b > 8 && a + b > max_time) {
      max_time = a + b;
      max_day = i;
    }
  }
  printf("%i\n", max_day);
  return 0;
}