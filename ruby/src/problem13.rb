numbers = IO.readlines("../data/problem13.txt")

puts numbers.inject(0){|sum, line| sum + line.to_i}.to_s[0..9]