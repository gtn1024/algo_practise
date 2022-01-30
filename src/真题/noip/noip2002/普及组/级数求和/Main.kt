// https://www.luogu.com.cn/problem/P1035
fun main() {
  val k = readLine()!!.toInt()
  var n = 0
  var s = 0.0
  while (s <= k) {
    n++
    s += 1.0 / n
  }
  println(n)
}
