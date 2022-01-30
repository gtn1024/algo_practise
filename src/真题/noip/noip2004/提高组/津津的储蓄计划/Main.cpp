// https://www.luogu.com.cn/problem/P1089
#include <bits/stdc++.h>

using namespace std;

int main() {
  int all_money = 0;
  int mother_money = 0;
  for (int i = 1; i <= 12; i++) {
    int need_money;
    all_money += 300;
    cin >> need_money;
    int tmp = (all_money - need_money) / 100;
    mother_money += tmp * 100;
    all_money -= tmp * 100;
    if (all_money < need_money) {
      cout << "-" << i << endl;
      return 0;
    }
    all_money -= need_money;
  }
  cout << all_money + mother_money * 1.2 << endl;
  return 0;
}