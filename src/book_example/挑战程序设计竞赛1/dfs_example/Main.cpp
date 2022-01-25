#include <iostream>
using namespace std;

const int MAX_N = 25;
int n, k;
int a[MAX_N];

// 已经从前i项得到了和sum，然后对于i项之后的进行分支
bool dfs(int i, int sum) {
  // 如果前n项都计算过了，则返回sum是否与k相等
  if (i == n) return sum == k;

  // 不加上a[i]的情况
  if (dfs(i + 1, sum)) return true;

  // 加上a[i]的情况
  if (dfs(i + 1, sum + a[i])) return true;

  // 无论是否加上a[i]都不能凑成k就返回false
  return false;
}

int main() {
  cin >> n >> k;
  for (int i = 1; i <= n; i++) {
    cin >> a[i];
  }

  if (dfs(0, 0)) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
  return 0;
}