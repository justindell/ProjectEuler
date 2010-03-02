package problem2

object EvenFibCounter extends Application {
	var sum = 0
	var fibNumbers = List[Int](1, 0)
 
	while (fibNumbers(0) < 1000000) {
	  fibNumbers = fibNumbers(0) + fibNumbers(1) :: fibNumbers
	  if (fibNumbers(0) % 2 == 0 && fibNumbers(0) < 1000000)
		  sum += fibNumbers(0)
	}
 
	println("Sum is: " + sum)
}
