#include <bits/stdc++.h>

using namespace std;
int main(void) {
  int a = 0, b = 0;
  int i;
  while (cin >> i, i != -1) {
    if (i == 1) {
      a++;
    } else if (i == 0) {
      b++;
    }
  }
  if (a > b) {
    cout << "Yes" << endl;
  } else if (a < b) {
    cout << "No" << endl;
  } else {
    cout << "Tie" << endl;
  }
  cout << a << ":" << b;
}