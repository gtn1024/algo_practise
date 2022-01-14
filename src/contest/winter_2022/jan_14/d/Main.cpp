// https://www.51nod.com/Challenge/Problem.html#problemId=1012
#include <iostream>
using namespace std;
typedef long long ll;
ll gcd(ll a, ll b) {
  if (b == 0)
    return a;
  return gcd(b, a % b);
}
ll lcm(ll a, ll b) {
  return a * b / gcd(a, b);
}
int main() {
  int a, b;
  cin >> a >> b;
  cout << lcm(a, b) << endl;
  return 0;
}