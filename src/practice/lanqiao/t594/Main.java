package practice.lanqiao.t594;

public class Main {
  static int[][] ls = new int[1010][1010];

  public static void main(String[] args) {
    System.out.println(solve(19, 19));
  }

  static int solve(int _x, int _y) {
    if (_x == 0 && _y == 0)
      return 1;
    int x = 0;
    int y = 0;
    ls[0][0] = 1;
    int cur = 1;
    int mode = 0;
    boolean locked = false;
    while (!(x == _x && y == _y)) {
      cur++;
      if (x == 0 && !locked) {
        locked = true;
        y++;
        ls[x][y] = cur;
        mode = 0;
        continue;
      } else if (y == 0 && !locked) {
        locked = true;
        x++;
        ls[x][y] = cur;
        mode = 1;
        continue;
      }
      locked = false;
      if (mode == 0) {
        x++;
        y--;
        ls[x][y] = cur;
      } else if (mode == 1) {
        x--;
        y++;
        ls[x][y] = cur;
      }
    }
    return ls[_x][_y];
  }
}
