#include <ios>
#include <iostream>
#define endl '\n'

int a, b;

int gcd(int a, int b) {
  if (b == 0) return a;
  return gcd(b, a % b);
}

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);
  std::cin >> a >> b;
  std::cout << gcd(a, b) << endl;
  return 0;
}