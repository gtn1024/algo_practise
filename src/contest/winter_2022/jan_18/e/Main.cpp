// https://www.51nod.com/Challenge/Problem.html#problemId=3268
#include <bits/stdc++.h>
using namespace std;
int main() {
  int a1, a2, n;
  cin >> a1 >> a2 >> n;
  int d = a2 - a1;
  cout << a1 + d * (n - 1) << endl;
  return 0;
}