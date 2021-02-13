package main

import (
	"fmt"
	"strconv"
)

func main() {

	fmt.Println(reverse(-32233223))
}

func reverse(x int) int {
	intString := strconv.Itoa(x)
	var sign int = 1
	cnt := 0

	if x<0 {
		sign = -1
		cnt = 1
	}
	newString := ""

	for i := len(intString); i > cnt; i-- {
		newString += string(intString[i-1])
	}

	//newInt,_ := strconv.Atoi(newString)

	i64, _ := strconv.ParseInt(newString, 10, 32)

	k := int32(i64)

	return int(k) * sign
	
}