package main

import (
	"fmt"
	"strings"
)

func main() {
	haystack := "aaaaa" 
	needle := "bba"

	fmt.Println(strStr(haystack,needle))
	
}

func strStr(haystack string, needle string) int {

	return strings.Index(haystack,needle)

}