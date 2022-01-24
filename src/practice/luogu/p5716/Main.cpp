// https://www.luogu.com.cn/problem/P5716
#include <cstdio>

int main() {
  int y, m;
  scanf("%i%i", &y, &m);
  int arr[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  if (m == 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
    printf("29\n");
  } else {
    printf("%i\n", arr[m]);
  }
  return 0;
}