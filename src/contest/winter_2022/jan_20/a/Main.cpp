#include <iostream>
using namespace std;
int gcd(int a, int b) {
  if (b == 0) return a;
  return gcd(b, a % b);
}

int lcm(int a, int b) { return a * b / gcd(a, b); }

int main() {
  int g, l;
  scanf("%d%d", &g, &l);
  for (int i = 2; i <= l; i++) {
    for (int j = 2; j <= l; j++) {
      if (gcd(i, j) == g && lcm(i, j) == l) {
        printf("%d\n", i + j);
        return 0;
      }
    }
  }
  return 0;
}