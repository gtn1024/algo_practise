// https://www.luogu.com.cn/problem/P5725
package main

import "fmt"

func main() {
	n := 0
	fmt.Scanf("%d", &n)
	a(n)
	fmt.Println()
	b(n)
}

func a(n int) {
	tmp := 1
	for i := 1; i <= n; i++ {
		for j := 1; j <= n; j++ {
			if tmp < 10 {
				fmt.Print(0)
			}
			fmt.Print(tmp)
			tmp++
		}
		fmt.Println()
	}
}
func b(n int) {
	tmp := 1
	for i := 1; i <= n; i++ {
		for j := n - i; j > 0; j-- {
			fmt.Print("  ")
		}
		for j := 0; j < i; j++ {
			if tmp < 10 {
				fmt.Print(0)
			}
			fmt.Print(tmp)
			tmp++
		}
		fmt.Println()
	}
}
