// https://www.luogu.com.cn/problem/P3954
fun main() {
  val i = readLine()!!.trim() { it <= ' ' }.split(" ").map { it.toInt() }
  println((i[0] * 0.2 + i[1] * 0.3 + i[2] * 0.5).toInt())
}
