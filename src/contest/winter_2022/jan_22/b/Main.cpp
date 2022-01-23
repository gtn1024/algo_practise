#include <bits/stdc++.h>
using namespace std;
int ls[20010];

int main() {
  int V, n;
  cin >> V >> n;
  for (int i = 0; i < n; i++) {
    int t;
    cin >> t;
    for (int j = V; j >= 0; j--) {
      if (j < t) break;
      ls[j] = max(ls[j], ls[j - t] + t);
    }
  }
  cout << V - ls[V];
  return 0;
}