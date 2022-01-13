// https://www.luogu.com.cn/problem/P1104
#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

typedef struct {
  int id;
  string name;
  int y, m, d;
} student;

bool cmp(student a, student b) {
  if (a.y > b.y) {
    return false;
  } else if (a.y < b.y) {
    return true;
  } else {
    if (a.m > b.m) {
      return false;
    } else if (a.m < b.m) {
      return true;
    } else {
      if (a.d > b.d) {
        return false;
      } else if (a.d < b.d) {
        return true;
      } else {
        if (a.id < b.id) {
          return false;
        } else {
          return true;
        }
      }
    }
  }
}

int main() {
  int n;
  cin >> n;
  student s[n];
  for (int i = 0; i < n; i++) {
    s[i].id = i + 1;
    cin >> s[i].name >> s[i].y >> s[i].m >> s[i].d;
  }
  sort(s, s + n, cmp);
  for (int i = 0; i < n; i++) {
    cout << s[i].name << endl;
  }
  return 0;
}