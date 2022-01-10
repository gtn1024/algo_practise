// https://www.luogu.com.cn/problem/P1008
#include <algorithm>
#include <cstdio>
#include <set>
using namespace std;

int main() {
  for (int a = 123; a < 333; a++) {
    int b = a * 2;
    int c = a * 3;
    set<int> s;
    s.insert(a / 100);
    s.insert((a % 100) / 10);
    s.insert(a % 10);
    s.insert(b / 100);
    s.insert((b % 100) / 10);
    s.insert(b % 10);
    s.insert(c / 100);
    s.insert((c % 100) / 10);
    s.insert(c % 10);
    if (find(s.begin(), s.end(), 0) != s.end()) {
      continue;
    }
    if (s.size() == 9) {
      printf("%i %i %i\n", a, b, c);
    }
  }
  return 0;
}
