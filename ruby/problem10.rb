require 'mathn.rb'

sum = 0
Prime.each() { |prime|
  if (prime > 2000000)
    puts "Sum is: " + sum.to_s
    exit
  end
  sum += prime
}