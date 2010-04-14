@numbers = IO.readlines("../data/problem18.txt")
@numbers.collect!{|arr| arr.split(" ")}

def max_from_here(num,x, y)
  return num if x == 14
  return [max_from_here(@numbers[x+1][y].to_i + num,x+1,y),
    max_from_here(@numbers[x+1][y+1].to_i + num,x+1,y+1)].max
end

puts max_from_here(@numbers[0][0].to_i,0,0)