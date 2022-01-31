#include <cstdio>
#include <list>
using namespace std;
int main() {
  int n;
  scanf("%d", &n);
  list<int> ls;
  ls.push_back(0);
  auto it = ls.begin();
  getchar();  // ignore \n
  char op;
  for (int i = 1; i <= n; i++) {
    scanf("%c", &op);
    if (op == 'L') {
      it = ls.insert(it, i);
    } else {
      it++;
      it = ls.insert(it, i);
    }
  }
  for (auto &&i : ls) {
    printf("%d ", i);
  }
  return 0;
}