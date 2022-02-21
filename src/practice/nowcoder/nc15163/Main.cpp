#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
int n, a[100010], b[100010];
ll cnt;  // 逆序对的个数

void m(int l, int mid, int r) {
  int pos_a = l, pos_b = mid + 1;
  for (int i = l; i <= r; ++i) {
    if (pos_b > r || (pos_a <= mid && a[pos_a] <= a[pos_b]))
      b[i] = a[pos_a++];
    else {
      b[i] = a[pos_b++];
      cnt += mid - pos_a + 1;  // 逆序对个数
    }
  }
  for (int i = l; i <= r; ++i) a[i] = b[i];
}

void ms(int l, int r) {
  if (l == r) return;
  int mid = (l + r) / 2;
  ms(l, mid);
  ms(mid + 1, r);
  m(l, mid, r);
}

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  std::cin >> n;
  for (int i = 1; i <= n; ++i) {
    std::cin >> a[i];
  }
  ms(1, n);
  // std::for_each(a + 1, a + n + 1, [](int i) { std::cout << i << ' '; });
  // std::cout << endl;
  std::cout << cnt << endl;
  return 0;
}