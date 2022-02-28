#include <ios>
#include <iostream>
#include <stack>
#define endl '\n'
typedef long long ll;
using namespace std;

int T, n;
int a[60010];
stack<int> st;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cin >> T >> n;
  while (T--) {
    for (int i = 1; i <= n; ++i) cin >> a[i];
    int j = 1;
    for (int i = 1; i <= n; ++i) {
      st.push(i);
      while (!st.empty() && a[j] == st.top()) {
        st.pop();
        j++;
      }
    }
    if (st.empty())
      cout << "YES" << endl;
    else
      cout << "NO" << endl;
  }
  return 0;
}