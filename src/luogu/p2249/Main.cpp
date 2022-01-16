// https://www.luogu.com.cn/problem/P2249
#include <bits/stdc++.h>
using namespace std;

int find_ele(int ls[], int length, int e) {
  int l = 0, r = length;  // 左闭右开
  int mid;
  bool flag = false;
  while (l < r) {
    mid = l + ((r - l) >> 1);
    if (ls[mid] == e) {
      r = mid;
      flag = true;
    } else if (ls[mid] < e) {
      l = mid + 1;
    } else if (ls[mid] > e) {
      r = mid;
    }
  }
  if (flag)
    return l + 1;
  else
    return -1;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int n, m;
  cin >> n >> m;
  int ls[n];
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
  }
  for (int i = 0; i < m; i++) {
    int tmp;
    cin >> tmp;
    cout << find_ele(ls, n, tmp) << ' ';
  }
  return 0;
}
