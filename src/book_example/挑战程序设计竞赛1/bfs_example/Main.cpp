#include <bits/stdc++.h>
using namespace std;

const int MAX_N = 110;
char maze[MAX_N][MAX_N];

int N, M;

const int INF = 100000000;

typedef pair<int, int> PII;

int sx, sy;  // 起点坐标
int gx, gy;  // 终点坐标

int d[MAX_N][MAX_N];  // 到各个位置的最短距离的数组

// 4个方向移动的向量
int dx[4] = {1, 0, -1, 0}, dy[4] = {0, 1, 0, -1};

// 求从(sx, sy)到(gx, gy)的最短距离
// 如果无法到达，则是INF
int bfs() {
  // TODO
}

int main() {
  cin >> N >> M;
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      cin >> maze[i][j];
    }
  }

  cout << bfs() << endl;
  return 0;
}