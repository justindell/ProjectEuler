1000.times { |a|
  a_squared = a**2  # So we dont calculate it over and over
  (1..a).each do |b|
    c = 1000 - a - b
    puts "Product: #{(a*b*c)}" if (c**2 == a_squared + b**2)
  end
}