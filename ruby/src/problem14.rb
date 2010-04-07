$num_items = [0]

def get_num_items(num) 
  if num == 1
    return 1
  end
  if $num_items[num]
    return 1 + $num_items[num]
  end
  if num % 2 == 0
    return 1 + get_num_items(num / 2)
  else
    return 1 + get_num_items(3 * num + 1)
  end
end

best = 0
best_candidate = 0
(1..1000000).each { |cand|
  items = get_num_items(cand)
  $num_items << items
  if (items > best)
    best = items
    best_candidate = cand
  end
}

puts best_candidate.to_s + " at " + best.to_s