#include <functional>
#include <ios>
#include <iostream>
#include <queue>
#include <vector>
#define endl '\n'
typedef long long ll;
using namespace std;

int n;
ll ans;
priority_queue<int, vector<int>, greater<int>> pq;  // 升序的优先队列

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  while (n--) {
    int tmp;
    cin >> tmp;
    pq.push(tmp);
  }
  while (pq.size() != 1) {
    int a = pq.top();
    pq.pop();
    int b = pq.top();
    pq.pop();
    pq.push(a + b);
    ans += a + b;
  }
  cout << ans << endl;
  return 0;
}