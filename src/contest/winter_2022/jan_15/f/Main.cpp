// https://www.51nod.com/Challenge/Problem.html#problemId=1046
#include <iostream>
using namespace std;
typedef long long ll;
ll qmi(ll a, ll b, ll c) {
  ll res = 1;
  a %= c;
  while (b) {
    if (b & 1)  // 奇数
      res = (res * a) % c;
    a = (a * a) % c;
    b >>= 1;
  }
  return res;
}
int main() {
  int a, b, c;
  cin >> a >> b >> c;
  cout << qmi(a, b, c) << endl;
  return 0;
}