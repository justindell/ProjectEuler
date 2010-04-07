def fact(n)
  return 1 if n==0
  return n * fact(n-1)
end

puts fact(100).to_s.split(//).inject(0){|sum,n| sum + n.to_i}