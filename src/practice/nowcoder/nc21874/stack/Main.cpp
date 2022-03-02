#include <bits/stdc++.h>

using namespace std;
stack<char> st;
bool solve(string s) {
  for (int i = 0; i < s.length(); ++i) {
    if (s[i] == 'a') {
      st.push(s[i]);
    } else if (s[i] == 'b') {
      if (!st.empty() && st.top() == 'a') {
        st.pop();
      } else {
        return false;
      }
    }
  }
  return st.empty();
}
int main() {
  string s;
  cin >> s;
  cout << (solve(s) ? "Good" : "Bad") << endl;
  return 0;
}