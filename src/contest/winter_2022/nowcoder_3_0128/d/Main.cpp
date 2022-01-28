#include <iostream>
#include <string>
using namespace std;
int main() {
  int n;
  string s;
  cin >> n;
  cin >> s;
  for (int i = 1; i < n; i++) {
    if (s[0] != s[i]) {
      char tmp = s[0];
      s[0] = s[i];
      s[i] = tmp;
      break;
    }
  }
  cout << s << endl;
  return 0;
}