#include <ios>
#include <iostream>
#define endl '\n'
typedef long long ll;
using namespace std;

bool used[10];
int ls[10];

void print() {
  for (int i = 1; i <= 8; ++i) {
    if (i == 1)
      cout << ls[i];
    else
      cout << ' ' << ls[i];
  }
  cout << endl;
}

void dfs(int x) {
  if (x == 9) {
    print();
    return;
  }
  for (int i = 1; i <= 8; ++i) {
    if (used[i]) continue;
    ls[x] = i;
    used[i] = true;
    dfs(x + 1);
    used[i] = false;
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  dfs(1);

  return 0;
}
