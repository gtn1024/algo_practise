// https://www.luogu.com.cn/problem/P1093
#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

typedef struct {
  int num;
  int chi, mat, eng;
  int sum;
} student;

bool cmp(student a, student b) {
  if (a.sum > b.sum) {
    return true;
  } else if (a.sum < b.sum) {
    return false;
  } else {
    if (a.chi > b.chi) {
      return true;
    } else if (a.chi < b.chi) {
      return false;
    } else {
      if (a.num < b.num) {
        return true;
      } else {
        return false;
      }
    }
  }
}

int main() {
  int n;
  cin >> n;
  student s[n];
  for (int i = 0; i < n; i++) {
    s[i].num = i + 1;
    cin >> s[i].chi >> s[i].mat >> s[i].eng;
    s[i].sum = s[i].chi + s[i].mat + s[i].eng;
  }
  sort(s, s + n, cmp);
  for (int i = 0; i < 5; i++) {
    cout << s[i].num << ' ' << s[i].sum << endl;
  }
  return 0;
}