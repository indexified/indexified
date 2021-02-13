package main

import (
	"fmt"
	"sort"
)

func main() {
	
	arr := []int{4,5,6,7,0,1,2}
	
	tar := 4

	
	fmt.Println(search(arr,tar))
}

func search(nums []int, target int) int {

	sort.Ints(nums)

	return sort.SearchInts(nums,target)

}