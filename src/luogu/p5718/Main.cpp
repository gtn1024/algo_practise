// https://www.luogu.com.cn/problem/P5718
#include <iostream>
using namespace std;
int main() {
  int n;
  cin >> n;
  int min = 1001;
  for (int i = 0; i < n; i++) {
    int tmp;
    cin >> tmp;
    if (min > tmp)
      min = tmp;
  }
  cout << min << endl;
  return 0;
}