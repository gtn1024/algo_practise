#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
vector<ll> p;
void pp(ll n) {
  if (n < 2) return;
  for (ll i = 2; i * i <= n; i++) {
    if (n % i == 0) {
      p.push_back(i);
      pp(n / i);
      return;
    }
  }
}
int main() {
  ll n;
  scanf("%lld", &n);
  printf("%lld=", n);
  pp(n);
  ll t = 0;
  ll s = 1;
  for (ll l : p) {
    s *= l;
    printf("%lld*", l);
  }
  printf("%lld\n", n / s);
  return 0;
}