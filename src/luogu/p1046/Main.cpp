// https://www.luogu.com.cn/problem/P1046
#include <cstdio>

int main() {
  int a[10];
  for (int i = 0; i < 10; i++) {
    scanf("%i", &a[i]);
  }
  int max;
  scanf("%i", &max);
  int count = 0;
  for (int i = 0; i < 10; i++) {
    if (max + 30 >= a[i])
      count++;
  }
  printf("%i\n", count);
  return 0;
}