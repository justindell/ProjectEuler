require 'mathn.rb'

puts "Sum is: " + Prime.take_while {|prime| prime < 2000000}.inject { |sum, n| sum + n}.to_s
