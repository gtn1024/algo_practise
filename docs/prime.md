# 判断质数

```cpp
bool isPrime(int n) {
  if(i <= 1) return false;
  for(int i = 2; i * i <= x; i++) {
    if(x % i == 0) return false;
  }
  return true;
}
```
