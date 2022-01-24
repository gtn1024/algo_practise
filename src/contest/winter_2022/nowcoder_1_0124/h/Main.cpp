// TODO: TLE
#include <bits/stdc++.h>
using namespace std;
int ls[1000010];
int main() {
  int n;
  scanf("%d", &n);
  for (int i = 1; i <= n; i++) {
    scanf("%d", &ls[i]);
  }
  long long sum = 0;
  for (int i = 1; i <= n; i++) {
    for (int j = i; j <= n; j++) {
      sum += abs(ls[i] + ls[j] - 1000);
    }
  }
  cout << sum << endl;
  return 0;
}