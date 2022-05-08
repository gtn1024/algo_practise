#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

int n, k, ls[24], cnt;

bool isPrime(int n) {
  if (n <= 1) return false;
  for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) return false;
  }
  return true;
}

void solve(int start, int count, int sum) {
  if (count == k && isPrime(sum)) {
    cnt++;
  }
  for (int i = start; i < n; i++) {
    solve(i + 1, count + 1, sum + ls[i]);
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n >> k;
  for (int i = 0; i < n; ++i) cin >> ls[i];
  solve(0, 0, 0);
  cout << cnt << endl;

  return 0;
}
