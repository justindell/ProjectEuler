(1..1000).each { |a|
  a_squared = a**2  # So we dont calculate it over and over
  (1..a).each { |b|
    c = 1000 - a - b
    if (c**2 == a_squared + b**2)
      puts "Product: " + (a*b*c).to_s
      exit 
    end
  }
}