package main

import (
	//"fmt"
	"fmt"
	"sort"
)

func main() {
	i := []int{1, 2, 3}
	j := []int{1, 4, 5}
	z := append(i, j...)
	sort.Sort(sort.IntSlice(z))
	fmt.Println(z)

}
