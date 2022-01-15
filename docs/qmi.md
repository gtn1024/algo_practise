# 快速幂

数学原理：$(a · b) \% p $ = $ [ (a \% p) · (b \% p) ] \% p$

算法原理：

$ 3^6 = ( 3^2 )^3 = 9^3 $

$ 9^3 = 9^2 · 9 = (9 ^ 2)^1 · 9 $

```cpp
// C++ 版
typedef long long ll;
ll qmi(ll a, ll b, ll p) {
  ll ans = 1;
  a %= p;
  while (b) {
    if (b & 1) {  // 相当于 b % 2 == 1
      // 奇数
      ans = (ans * a) % p;
    }
    a = (a * a) % p;
    b >>= 1;  // 相当于 b / 2
  }
  return ans;
}
```
