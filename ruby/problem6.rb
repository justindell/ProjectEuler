puts "Difference is: " + (((1...100).inject{ |i,j| i+j })**2 - (1...100).inject { |i,j| i += j**2 }).to_s