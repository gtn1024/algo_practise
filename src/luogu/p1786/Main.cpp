// https://www.luogu.com.cn/problem/P1786
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef struct {
  string name, pos;
  ll bg;
  int dj;
  int pos_i;
  int i;
} sp;

int main() {
  int n;
  cin >> n;
  sp ps[n];
  for (int i = 0; i < n; i++) {
    cin >> ps[i].name >> ps[i].pos >> ps[i].bg >> ps[i].dj;
    ps[i].pos_i = -1;
    ps[i].i = i;
  }
  sort(ps, ps + n, [](sp a, sp b) {
    if (a.bg > b.bg) {
      return true;
    } else if (a.bg < b.bg) {
      return false;
    } else {
      if (a.i < b.i) {
        return true;
      } else {
        return false;
      }
    }
  });
  int p = 0;
  for (int i = 0; i < n; i++) {
    if (ps[i].pos.compare("BangZhu") == 0) {
      ps[i].pos_i = 1;
    } else if (ps[i].pos.compare("FuBangZhu") == 0) {
      ps[i].pos_i = 2;
    } else {
      p++;
      if (p <= 2) {
        // 两位护法
        ps[i].pos = "HuFa";
        ps[i].pos_i = 3;
      } else if (p <= 6) {
        // 四位长老
        ps[i].pos = "ZhangLao";
        ps[i].pos_i = 4;
      } else if (p <= 13) {
        // 七位堂主
        ps[i].pos = "TangZhu";
        ps[i].pos_i = 5;
      } else if (p <= 38) {
        // 二十五名精英
        ps[i].pos = "JingYing";
        ps[i].pos_i = 6;
      } else {
        // 帮众
        ps[i].pos = "BangZhong";
        ps[i].pos_i = 7;
      }
    }
  }
  sort(ps, ps + n, [](sp a, sp b) {
    if (a.pos_i < b.pos_i) {
      return true;
    } else if (a.pos_i > b.pos_i) {
      return false;
    } else {
      if (a.dj > b.dj) {
        return true;
      } else if (a.dj < b.dj) {
        return false;
      } else {
        if (a.i < b.i) {
          return true;
        } else {
          return false;
        }
      }
    }
  });
  for (sp p : ps) {
    cout << p.name << ' ' << p.pos << ' ' << p.dj << endl;
  }
  return 0;
}