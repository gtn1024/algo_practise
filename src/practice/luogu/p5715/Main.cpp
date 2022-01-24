// https://www.luogu.com.cn/problem/P5715
#include <algorithm>
#include <cstdio>

using namespace std;
int main() {
  int arr[3];
  scanf("%i%i%i", &arr[0], &arr[1], &arr[2]);
  sort(arr, arr + 3);
  printf("%i %i %i\n", arr[0], arr[1], arr[2]);
  return 0;
}