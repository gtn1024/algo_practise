#include <ios>
#include <iostream>
#include <stack>
#include <string>
#define endl '\n'
typedef long long ll;
using namespace std;

int q, op, p;
string ap_s;

const int APPEND = 1;
const int DELETE = 2;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  while (cin >> q) {
    stack<string> st;
    st.push("");
    while (q--) {
      cin >> op;
      if (op == 1) {
        cin >> ap_s;
        st.push(st.top() + ap_s);
      } else if (op == 2) {
        cin >> p;
        st.push(st.top().substr(0, st.top().length() - p));
      } else if (op == 3) {
        cin >> p;
        cout << st.top()[p - 1] << endl;
      } else if (op == 4 && !st.empty()) {
        st.pop();
      }
    }
  }

  return 0;
}
