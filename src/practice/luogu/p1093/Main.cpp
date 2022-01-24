// https://www.luogu.com.cn/problem/P1093
#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

typedef struct student {
  int num;
  int chi, mat, eng;
  int sum;

  bool operator<(const student& b) {
    if (sum > b.sum) {
      return true;
    } else if (sum < b.sum) {
      return false;
    } else {
      if (chi > b.chi) {
        return true;
      } else if (chi < b.chi) {
        return false;
      } else {
        if (num < b.num) {
          return true;
        } else {
          return false;
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
    s[i].num = i + 1;
    cin >> s[i].chi >> s[i].mat >> s[i].eng;
    s[i].sum = s[i].chi + s[i].mat + s[i].eng;
  }
  sort(s, s + n);
  for (int i = 0; i < 5; i++) {
    cout << s[i].num << ' ' << s[i].sum << endl;
  }
  return 0;
}