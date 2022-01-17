// https://nanti.jisuanke.com/t/T2065
#include <algorithm>
#include <iostream>
using namespace std;
int main() {
  int n;
  cin >> n;
  bool ng = n < 0;
  string s = to_string(abs(n));
  reverse(s.begin(), s.end());
  if (ng)
    cout << '-';
  cout << stoi(s) << endl;
  return 0;
}