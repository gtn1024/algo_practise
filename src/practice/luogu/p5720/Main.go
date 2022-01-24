// https://www.luogu.com.cn/problem/P5720
package main

import "fmt"

func main() {
	var a int
	fmt.Scanf("%d", &a)
	i := 1
	for a > 1 {
		a /= 2
		i++
	}
	fmt.Println(i)
}
