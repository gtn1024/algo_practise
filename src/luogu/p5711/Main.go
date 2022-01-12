// https://www.luogu.com.cn/problem/P5711
package main

import "fmt"

func main() {
	var i int
	fmt.Scanf("%d", &i)
	if (i%4 == 0 && i%100 != 0) || i%400 == 0 {
		fmt.Println(1)
	} else {
		fmt.Println(0)
	}
}
