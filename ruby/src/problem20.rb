puts (1..100).inject(1){|factorial,i| factorial * i}.to_s.split(//).inject(0){|sum,n| sum + n.to_i}