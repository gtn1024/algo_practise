// TODO: TLE
#include <cstdio>
using namespace std;
typedef long long ll;
int main() {
  int t;
  scanf("%d", &t);
  for (int i = 0; i < t; i++) {
    int n, m;
    scanf("%d%d", &n, &m);
    if (n == 1 && m == 1) {
      printf("1\n");
      continue;
    }
    if (m == 1) {
      printf("-1\n");
      continue;
    }
    ll all_time = 1;    // 总时间
    int all_p = n - m;  // 没有卡的人
    while (all_p > 0) {
      all_p += 1;
      all_time += 2;
      all_p -= m;
    }
    printf("%lld\n", all_time);
  }
  return 0;
}