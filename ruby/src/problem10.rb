require '../lib/prime.rb'

puts "Sum is: " + Prime.each(2000000).inject { |sum, n| sum + n}.to_s
