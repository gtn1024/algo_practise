// http://poj.org/problem?id=2386
#include <iostream>
using namespace std;

const int MAX_N = 110;
int n, m;
char ls[MAX_N][MAX_N];

// (x, y)
void dfs(int x, int y) {
  // 将当前格子替换为'.'
  ls[x][y] = '.';

  // 遍历8个方向
  for (int dx = -1; dx <= 1; ++dx) {
    for (int dy = -1; dy <= 1; ++dy) {
      // 向x方向移动dx，向y方向移动dy，移动结果为(nx, ny)
      int nx = x + dx, ny = y + dy;

      // 判断(nx, ny)是否在园子内，以及是否有积水
      if (0 <= nx && nx < n && 0 <= ny && ny < m && ls[nx][ny] == 'W')
        dfs(nx, ny);
    }
  }
}

int main() {
  cin >> n >> m;
  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < m; ++j) {
      cin >> ls[i][j];
    }
  }
  int cnt = 0;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if (ls[i][j] == 'W') {
        dfs(i, j);
        cnt++;
      }
    }
  }
  cout << cnt << endl;
  return 0;
}