#include <bits/stdc++.h>
using namespace std;
int main() {
  int T;  // 总时间
  int M;  // 草药数目
  scanf("%d%d", &T, &M);
  int ls[1001] = {0};
  for (int i = 1; i <= M; i++) {
    int time, value;
    scanf("%d%d", &time, &value);
    for (int j = T; j >= 0; j--) {
      if (j < time) break;
      ls[j] = max(ls[j], ls[j - time] + value);
    }
  }
  cout << ls[T] << endl;
  return 0;
}