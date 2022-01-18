// https://www.51nod.com/Challenge/Problem.html#problemId=2160
#include <cstdio>
#include <deque>
using namespace std;
int main() {
  deque<int> ls;
  int n, tmp;
  scanf("%d", &n);
  if (n > 0) {
    scanf("%d", &tmp);
    ls.push_back(tmp);
  }
  for (int i = 1; i < n; i++) {
    scanf("%d", &tmp);
    while (!ls.empty() && ls.back() < tmp) {
      ls.pop_back();
    }
    ls.push_back(tmp);
  }
  while (!ls.empty()) {
    printf("%d\n", ls.front());
    ls.pop_front();
  }
  return 0;
}