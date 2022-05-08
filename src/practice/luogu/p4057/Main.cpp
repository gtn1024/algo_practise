#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

ll gcd(ll a, ll b) {
  if (b == 0) return a;
  return gcd(b, a % b);
}

ll lcm(ll a, ll b) { return a * b / gcd(a, b); }

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll a, b, c;
  cin >> a >> b >> c;
  cout << lcm(lcm(a, b), c) << endl;

  return 0;
}