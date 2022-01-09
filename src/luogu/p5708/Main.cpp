// https://www.luogu.com.cn/problem/P5708
#include <cmath>
#include <cstdio>
int main() {
  double a, b, c;
  scanf("%lf%lf%lf", &a, &b, &c);
  double p = (a + b + c) / 2.0;
  printf("%.1lf\n", sqrt(p * (p - a) * (p - b) * (p - c)));
  return 0;
}