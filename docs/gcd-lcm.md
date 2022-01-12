# 最大公约数和最小公倍数

```cpp
int gcd(int a, int b) {
  if(b==0) return a;
  return gcd(b, a % b);
}
```

```cpp
int lcm(int a, int b) {
  return a * b / gcd(a, b);
}
```
