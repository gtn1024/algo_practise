// https://nanti.jisuanke.com/t/T1193
#include <bits/stdc++.h>
using namespace std;
typedef struct {
  int a, b, c, d;
} sss;
int main() {
  int n;
  cin >> n;
  sss ssss[1000];
  int count = 0;
  for (int b = 1; b <= n; b++) {
    for (int c = b; c <= n; c++) {
      for (int d = c; d <= n; d++) {
        double da = pow(b * b * b + c * c * c + d * d * d, 1.0 / 3);
        int ia = (int)(da + 1e-7);
        if (fabs(da - ia) < 1e-6) {
          if (ia > n || b > n || c > n || d > n)
            continue;
          if (ia <= 1 || b <= 1 || c <= 1 || d <= 1)
            continue;
          ssss[count].a = ia;
          ssss[count].b = b;
          ssss[count].c = c;
          ssss[count].d = d;
          count++;
        }
      }
    }
  }
  sort(ssss, ssss + count, [](sss a, sss b) {
    if (a.a < b.a) {
      return true;
    } else if (a.a > b.a) {
      return false;
    } else {
      if (a.b < b.b) {
        return true;
      } else if (a.b > b.b) {
        return false;
      } else {
        if (a.c < b.c) {
          return true;
        } else if (a.c > b.c) {
          return false;
        } else {
          if (a.d < b.d) {
            return true;
          }
          return false;
        }
      }
    }
  });
  for (int i = 0; i < count; i++) {
    printf("Cube = %i, Triple = (%i,%i,%i)\n", ssss[i].a, ssss[i].b, ssss[i].c,
           ssss[i].d);
  }

  return 0;
}