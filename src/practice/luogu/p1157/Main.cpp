#include <iomanip>
#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

int n, r, ls[24];

void print() {
  for (int i = 1; i <= r; ++i) {
    cout << setw(3) << ls[i];
  }
  cout << endl;
}

void dfs(int k) {
  if (k > r) {
    print();
    return;
  }
  for (int i = ls[k - 1] + 1; i <= n; ++i) {
    ls[k] = i;
    dfs(k + 1);
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n >> r;
  dfs(1);

  return 0;
}