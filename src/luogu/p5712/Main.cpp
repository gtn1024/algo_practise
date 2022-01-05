// https://www.luogu.com.cn/problem/P5712
#include <cstdio>

int main() {
  int i;
  scanf("%i", &i);
  printf("Today, I ate %i ", i);
  if (i > 1) {
    printf("apples.\n");
  } else {
    printf("apple.\n");
  }
  return 0;
}