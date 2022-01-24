// https://www.luogu.com.cn/problem/P5713
#include <cstdio>

int main() {
  int i;
  scanf("%i", &i);
  int local = 5 * i;
  int luogu = 11 + 3 * i;
  printf("%s\n", local < luogu ? "Local" : "Luogu");
  return 0;
}