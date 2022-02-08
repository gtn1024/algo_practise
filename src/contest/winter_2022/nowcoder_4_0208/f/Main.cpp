#include <bits/stdc++.h>
using namespace std;
char c(char chr) {
  char cc;
  switch (chr) {
    case 'C':
      cc = '1';
      break;
    case 'D':
      cc = '2';
      break;
    case 'E':
      cc = '3';
      break;
    case 'F':
      cc = '4';
      break;
    case 'G':
      cc = '5';
      break;
    case 'A':
      cc = '6';
      break;
    case 'B':
      cc = '7';
      break;
  }
  return cc;
}

int main() {
  string s;
  cin >> s;
  int cnt = 0;
  for (int i = 0; i < s.length(); i++) {
    if (s[i] == '<') {
      cnt--;
    } else if (s[i] == '>') {
      cnt++;
    } else {
      cout << c(s[i]);
      for (int j = 0; j < abs(cnt); j++) {
        if (cnt > 0) {
          cout << '*';
        } else {
          cout << '.';
        }
      }
    }
  }
  cout << endl;
  return 0;
}