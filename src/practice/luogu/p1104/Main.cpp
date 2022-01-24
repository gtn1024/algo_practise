// https://www.luogu.com.cn/problem/P1104
#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

typedef struct student {
  int id;
  string name;
  int y, m, d;

  bool operator<(const student& b) const {
    if (y > b.y) {
      return false;
    } else if (y < b.y) {
      return true;
    } else {
      if (m > b.m) {
        return false;
      } else if (m < b.m) {
        return true;
      } else {
        if (d > b.d) {
          return false;
        } else if (d < b.d) {
          return true;
        } else {
          if (id < b.id) {
            return false;
          } else {
            return true;
          }
        }
      }
    }
  }
} student;

int main() {
  int n;
  cin >> n;
  student s[n];
  for (int i = 0; i < n; i++) {
    s[i].id = i + 1;
    cin >> s[i].name >> s[i].y >> s[i].m >> s[i].d;
  }
  sort(s, s + n);
  for (int i = 0; i < n; i++) {
    cout << s[i].name << endl;
  }
  return 0;
}