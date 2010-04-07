$found_paths = Array.new(21) { Array.new(21) }

def num_paths(x,y)
  return 0 if (x == 0 && y == 0) || (x < 0 || y < 0)
  return 1 if (x == 1 && y == 0) || (x == 0 && y == 1)
  return $found_paths[x][y] if $found_paths[x][y]
  $found_paths[x][y] = num_paths(x-1,y) + num_paths(x,y-1)
end

puts num_paths(20,20)
