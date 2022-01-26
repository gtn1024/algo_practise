#include <bits/stdc++.h>
using namespace std;
int ls[10];
int main() {
  string s;
  cin >> s;
  for (int i = 0; i < s.length(); i++) {
    if (s[i] == '5') continue;
    ls[s[i] - '0']++;
    ls[5]++;
  }
  for (int i = 1; i <= 9; i++) {
    cout << ls[i] << ' ';
  }
  cout << endl;
  return 0;
}