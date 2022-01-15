// https://www.51nod.com/Challenge/Problem.html#problemId=2068
#include <bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin >> n;
  queue<int> q;
  for (int i = 1; i <= n; i++) {
    q.push(i);
  }
  while (q.size() >= 2) {
    cout << q.front() << " ";
    q.pop();
    q.push(q.front());
    q.pop();
  }
  cout << q.front();
  return 0;
}