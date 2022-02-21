#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'

int n, a[10010];

void quick_sort(int l, int r) {
  int i = l, j = r, mid = (l + r) / 2;
  int x = a[mid];
  while (i <= j) {
    while (a[i] < x) i++;  // 找左边第一个大于等于基准的元素
    while (a[j] > x) j--;  // 找右边第一个小于等于基准的元素
    if (i <= j) {
      std::swap(a[i], a[j]);
      i++;
      j--;
    }
  }
  if (l < j) quick_sort(l, j);
  if (i < r) quick_sort(i, r);
}

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);
  std::cin >> n;
  for (int i = 1; i <= n; ++i) {
    std::cin >> a[i];
  }
  quick_sort(1, n);
  std::for_each(a + 1, a + n + 1, [](int i) { std::cout << i << ' '; });
  std::cout << endl;
  return 0;
}