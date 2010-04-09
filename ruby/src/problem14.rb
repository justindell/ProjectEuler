class Problem14
  def initialize
    @num_items = [0]
  end

  def get_num_items num
    return 1 if num == 1
    return 1 + @num_items[num] if @num_items[num]
    return 1 + get_num_items(num / 2) if num % 2 == 0
    return 1 + get_num_items(3 * num + 1)
  end

  def get_longest_chain limit
    best_length = 0
    best_candidate = 0
    (1..limit).each { |cand|
      items = get_num_items(cand)
      @num_items << items
      if (items > best_length)
        best_length = items
        best_candidate = cand
      end
    }

    return best_candidate
  end
end