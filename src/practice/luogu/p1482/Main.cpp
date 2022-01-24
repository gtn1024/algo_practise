// https://www.luogu.com.cn/problem/P1482
#include <cstdio>

int gcd(int a, int b) {
  if (a < b) {
    int tmp = a;
    a = b;
    b = tmp;
  }
  if (b == 0)
    return a;
  return gcd(b, a % b);
}

int main() {
  int a1, a2, b1, b2;
  scanf("%i/%i", &a1, &a2);
  scanf("%i/%i", &b1, &b2);
  int a = a1 * b1;
  int b = a2 * b2;
  int tmp = gcd(a, b);
  a /= tmp;
  b /= tmp;
  printf("%i %i\n", b, a);
  return 0;
}
