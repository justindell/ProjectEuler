class Problem9
  (1..1000).each { |a|
    aSquared = a**2  # So we dont calculate it over and over
    (1..a).each { |b|
      c = 1000 - a - b
      if (c**2 == aSquared + b**2)
        puts "a: " + a.to_s + " b: " + b.to_s + " c: " + c.to_s
        puts "Product: " + (a*b*c).to_s
      end
    }
  }
end