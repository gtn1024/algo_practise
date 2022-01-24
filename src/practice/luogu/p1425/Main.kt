// https://www.luogu.com.cn/problem/P1425

fun main() {
  val t = readLine()!!.split(" ").map { it.toInt() }
  val at: Int = (t[2] - t[0] - 1) * 60 + (60 - t[1]) + t[3]
  println("${at / 60} ${at % 60}")
}
