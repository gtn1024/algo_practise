// https://www.luogu.com.cn/problem/P5710

#include <cstdio>

bool a(int i) {
  return i % 2 == 0;
}

bool b(int i) {
  return i > 4 && i <= 12;
}

int main() {
  int i;
  scanf("%i", &i);
  printf("%i %i %i %i\n", a(i) && b(i) ? 1 : 0, a(i) || b(i) ? 1 : 0,
         (a(i) && !b(i)) || (!a(i) && b(i)) ? 1 : 0, !a(i) && !b(i) ? 1 : 0);
  return 0;
}
