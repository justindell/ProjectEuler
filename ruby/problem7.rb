require 'mathn.rb'

x = 0
puts "10001st Prime: "
Prime.each(1000000){ |i|
  x += 1
  if (x == 10001)
    puts i.to_s
    break
  end
}