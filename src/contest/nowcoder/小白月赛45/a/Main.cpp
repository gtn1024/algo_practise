#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

ll x, n;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> x >> n;
  if (n > x) {
    cout << x << endl;
  } else {
    cout << n * x << endl;
  }

  return 0;
}