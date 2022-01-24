// https://www.luogu.com.cn/problem/P5707
fun main() {
  val i = readLine()!!.split(" ").map { it.toInt() }
  val t: Int = 10 + Math.ceil(1.0 * i[0] / i[1]).toInt()
  var hr = 7 - t / 60
  val min = 60 - t % 60
  if (hr < 0) hr += 24
  print(if (hr < 10) "0" + hr else hr)
  println(":" + (if (min < 10) "0" + min else min))
}
