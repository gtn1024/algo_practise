// https://www.luogu.com.cn/problem/P5721
package main

import "fmt"

func main() {
	var n int
	fmt.Scanf("%d", &n)
	t := 1
	for i := 0; i < n; i++ {
		for j := n - i; j > 0; j-- {
			if t < 10 {
				fmt.Print(0)
			}
			fmt.Print(t)
			t++
		}
		fmt.Println()
	}
}
