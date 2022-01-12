// https://www.luogu.com.cn/problem/P1428
#include <iostream>
using namespace std;
int main() {
  int n;
  cin >> n;
  int ls[n];
  for (int i = 0; i < n; i++) {
    cin >> ls[i];
  }
  for (int i = 0; i < n; i++) {
    int count = 0;
    for (int j = 0; j < i; j++) {
      if (ls[i] > ls[j])
        count++;
    }
    cout << count << ' ';
  }
  return 0;
}
