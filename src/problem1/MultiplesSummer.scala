package problem1

object MultiplesSummer extends Application {
	var sum = 0
	for( i <- 0 to 999 if(i % 3 == 0 || i % 5 == 0) ) sum += i
	println("Sum is: " + sum)
}
