// https://www.luogu.com.cn/problem/P5724
package main

import "fmt"

func main() {
	n := 0
	fmt.Scanf("%d", &n)
	min := 1001
	max := -1
	for i := 0; i < n; i++ {
		tmp := 0
		fmt.Scanf("%d", &tmp)
		if tmp < min {
			min = tmp
		}
		if tmp > max {
			max = tmp
		}
	}
	fmt.Println(max - min)
}
