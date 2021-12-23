// https://www.luogu.com.cn/problem/P1115
#include <bits/stdc++.h>
using namespace std;
// TODO: 1WA, 3TLE
int main() {
  int n;
  cin >> n;
  int array[n + 1];
  int tmp;
  for (int i = 1; i < n + 1; i++) {
    cin >> tmp;
    array[i] = array[i - 1] + tmp;
  }
  int max = 0;
  for (int i = 0; i < n + 1; i++) {
    for (int j = i + 1; j < n + 1; j++) {
      if (array[j] - array[i] > max)
        max = array[j] - array[i];
    }
  }
  cout << max << endl;
  return 0;
}
