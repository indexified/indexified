package main

import "fmt"


func reverse(i string) string {
	runes := []rune(i)
	for i, j := 0, len(i)-1; i < j; i,j = i+1,j-1 {
		runes[i], runes[j]	=	runes[j], runes[i]
	}

	return string(runes)
}

func main() {

	fmt.Println(reverse("1234567890"))

}