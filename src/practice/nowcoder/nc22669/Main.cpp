#include <algorithm>
#include <ios>
#include <iostream>
#include <stack>
#define endl '\n'
typedef long long ll;
using namespace std;

stack<int> st;
int n;
int a[6000010], maxn[6000010];

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  for (int i = 1; i <= n; ++i) cin >> a[i];
  for (int i = n; i >= 1; --i) maxn[i] = max(maxn[i + 1], a[i]);
  for (int i = 1; i <= n; ++i) {
    st.push(a[i]);
    while (!st.empty() && st.top() > maxn[i + 1]) {
      cout << st.top() << ' ';
      st.pop();
    }
  }
  while (!st.empty()) {
    cout << st.top() << ' ';
    st.pop();
  }
  return 0;
}
