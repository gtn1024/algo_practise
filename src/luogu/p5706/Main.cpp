// https://www.luogu.com.cn/problem/P5706

#include <cstdio>

int main() {
  float a;
  int b;
  scanf("%f %i", &a, &b);
  printf("%.3f\n%i\n", a / b, b * 2);
  return 0;
}