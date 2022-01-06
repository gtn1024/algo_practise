// https://www.luogu.com.cn/problem/P5706
fun main() {
  val s = readLine()!!.split(" ")
  val a = s[0].toDouble()
  val b = s[1].toInt()
  println(String.format("%.3f", a / b))
  println(b * 2)
}
