#include <ios>
#include <iostream>
#include <string>
#define endl '\n'
typedef long long ll;
using namespace std;

int n;

int f(int x) {
  string s = to_string(x);
  ll su = 0;
  for (int i = 0; i < s.length(); ++i) {
    su += (int)(s[i] - '0');
  }
  return su < 10 ? su : f(su);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  cout << f(n) << endl;

  return 0;
}