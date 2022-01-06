// https://www.luogu.com.cn/problem/P1075

#include <cstdio>

bool isPrime(int n) {
  if (n < 2)
    return false;

  if (n == 2)
    return true;

  if (n % 2 == 0)
    return false;

  for (int i = 3; i * i < n; i += 2) {
    if (n % i == 0) {
      return false;
    }
  }
  return true;
}

int main() {
  int mul;
  scanf("%i", &mul);
  int i = 1;
  int j = 0;
  do {
    i++;
    if (isPrime(i)) {
      j = mul / i;
    }

  } while (j * i != mul);
  printf("%i\n", j);
  return 0;
}