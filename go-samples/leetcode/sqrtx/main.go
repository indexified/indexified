package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println(mySqrt(8))
}

func mySqrt(x int) int {
	return int(math.Sqrt(float64(x)))
}