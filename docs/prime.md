# 判断质数

```cpp
bool isPrime(int n) {
  if(n <= 1) return false;
  for(int i = 2; i * i <= n; i++) {
    if(n % i == 0) return false;
  }
  return true;
}
```

```cpp
// O(nlogn)
int v[5005], p[5005];
bool isPrime(int n){
  int cnt = 0;
  for(int i = 2;i<=n;i++){
    if(v[i]) continue;
    p[++cnt]=i;
    for(int j = 2; j * i<=n;j++) v[i*j]=1;
  }
  return cnt;
}
```

```cpp
// O(n)
#include <bits/stdc++.h>
using namespace std;
int v[50005], p[50005];
int cnt;
void prime(int n) {
  memset(v, 0, sizeof(v));
  for (int i = 2; i <= n; i++) {
    if (v[i] == 0) {
      v[i] = i;
      p[++cnt] = i;
    }
    for (int j = 1; j <= cnt; j++) {
      if (p[j] > v[i] || p[j] * i > n) break;
      v[i * p[j]] = p[j];
    }
  }
}
```
