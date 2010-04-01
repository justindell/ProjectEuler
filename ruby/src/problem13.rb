numbers = IO.readlines("../data/problem13.txt")

puts numbers.inject(0){|sum, line| sum + line.slice(0..10).to_i}.to_s.slice(0..9)