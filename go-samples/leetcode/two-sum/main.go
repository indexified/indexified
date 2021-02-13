package main

import "fmt"




func twoSum(nums []int, target int) []int {

	var s []int = nums
	var t []int

	for i := 0; i < len(nums)-1; i++ {
		for j := i+1; j < len(s); j++ {
			
			if nums[i]+s[j]==target {
				//fmt.Println(i)
				//fmt.Println(j)
				t = append(t, i)
				t = append(t, j)
				return t
			}
		}	
	}

}

func main() {
	num := []int{2,7,11,15}
	tar := 9
	fmt.Println(twoSum(num,tar))
}

