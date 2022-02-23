// https://www.luogu.com.cn/problem/P1177
#include <algorithm>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

int n, ls[100010], ls2[100010];

void m(int l, int r, int mid) {
  int a = l, b = mid + 1;
  for (int i = l; i <= r; ++i) {
    if (b > r || (a <= mid && ls[a] <= ls[b])) {
      ls2[i] = ls[a++];
    } else {
      ls2[i] = ls[b++];
    }
  }
  for (int i = l; i <= r; ++i) {
    ls[i] = ls2[i];
  }
}

void ms(int l, int r) {
  if (l == r) return;
  int mid = (l + r) / 2;
  ms(l, mid);
  ms(mid + 1, r);
  m(l, r, mid);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cin >> n;
  for (int i = 1; i <= n; ++i) {
    cin >> ls[i];
  }
  ms(1, n);
  for (int i = 1; i <= n; ++i) {
    cout << ls[i] << ' ';
  }
  return 0;
}
