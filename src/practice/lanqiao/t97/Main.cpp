#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

ll a[100010], b[100010];
int n, k;
ll cnt, sum;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n >> k;
  for (int i = 0; i < n; i++) {
    cin >> a[i];
    sum += a[i];
    b[sum % k]++;
  }
  cnt += b[0];
  for (int i = 0; i < k; i++) {
    cnt += b[i] * (b[i] - 1) / 2;
  }
  cout << cnt << endl;

  return 0;
}
