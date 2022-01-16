#include <algorithm>
#include <iostream>
using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n];
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
  }
  sort(ls, ls + n);
  cout << ls[n >> 1] << endl;
  return 0;
}