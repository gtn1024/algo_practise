#include <bits/stdc++.h>
using namespace std;
int main() {
  int H, W;
  cin >> H >> W;
  int ls[H][W];
  for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
      cin >> ls[i][j];
    }
  }
  int new_ls[W][H];
  for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
      new_ls[j][i] = ls[i][j];
    }
  }
  for (int i = 0; i < W; i++) {
    for (int j = 0; j < H; j++) {
      cout << new_ls[i][j] << ' ';
    }
    cout << endl;
  }
  return 0;
}