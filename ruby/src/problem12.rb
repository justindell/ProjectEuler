require 'lib/prime.rb'

#If you factor a number into its prime power factors, then the total
#number of factors is found by adding one to all the exponents and
#multiplying those results together. Example: 108 = 2^2*3^3, so the
#total number of factors is (2+1)*(3+1) = 3*4 = 12.

class Problem12

  def self.triangle_number_with_most_factors factor_limit, up_to_number
    next_triangle_number = 1
    (2..up_to_number).collect { |i| next_triangle_number += i }.each { |candidate|
      num_factors = Prime.prime_division(candidate).collect{|arr| arr[1]+1 }.inject{|sum,n| sum * n}
      if (num_factors > factor_limit)
        return candidate
      end
    }
  end
end