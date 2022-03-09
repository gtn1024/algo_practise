#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

int n, t;
typedef struct {
  int m, v;
} coin;
coin coins[110];
int r, i;
double val;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n >> t;
  r = t;
  for (i = 1; i <= n; ++i) cin >> coins[i].m >> coins[i].v;
  sort(coins + 1, coins + 1 + n,
       [](coin a, coin b) { return a.v * b.m > b.v * a.m; });
  // 按照单位价值排序，(a.v) / (a.m) > (b.v) / (b.m)
  for (i = 1; i <= n; ++i) {
    if (r < coins[i].m) break;
    r -= coins[i].m;
    val += coins[i].v;
  }
  if (r > 0 && i <= n) val += r * (1.0 * coins[i].v / coins[i].m);
  printf("%.2lf\n", val);

  return 0;
}