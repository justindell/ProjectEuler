class Integer
  def to_long_string
    split_num = self.to_s.split(//)
    if self == 1000
      return "one thousand"
    elsif self >= 100
      if self % 100 == 0
        return split_num[0].to_i.to_long_string + " hundred"
      else
        return split_num[0].to_i.to_long_string + " hundred and " + (split_num[1]+split_num[2]).to_i.to_long_string
      end
    elsif self >= 20
      return "ninety" + split_num[1].to_i.to_long_string if split_num[0].to_i ==9
      return "eighty" + split_num[1].to_i.to_long_string if split_num[0].to_i ==8
      return "seventy" + split_num[1].to_i.to_long_string if split_num[0].to_i ==7
      return "sixty" + split_num[1].to_i.to_long_string if split_num[0].to_i ==6
      return "fifty" + split_num[1].to_i.to_long_string if split_num[0].to_i ==5
      return "forty" + split_num[1].to_i.to_long_string if split_num[0].to_i ==4
      return "thirty" + split_num[1].to_i.to_long_string if split_num[0].to_i ==3
      return "twenty" + split_num[1].to_i.to_long_string if split_num[0].to_i ==2
    else
      if split_num.length == 2
        return "nineteen" if (split_num[0]+split_num[1]).to_i ==19
        return "eighteen" if (split_num[0]+split_num[1]).to_i ==18
        return "seventeen" if (split_num[0]+split_num[1]).to_i ==17
        return "sixteen" if (split_num[0]+split_num[1]).to_i ==16
        return "fifteen" if (split_num[0]+split_num[1]).to_i ==15
        return "fourteen" if (split_num[0]+split_num[1]).to_i ==14
        return "thirteen" if (split_num[0]+split_num[1]).to_i ==13
        return "twelve" if (split_num[0]+split_num[1]).to_i ==12
        return "eleven" if (split_num[0]+split_num[1]).to_i ==11
        return "ten" if (split_num[0]+split_num[1]).to_i ==10
      else
        return "nine" if split_num[0].to_i ==9
        return "eight" if split_num[0].to_i ==8
        return "seven" if split_num[0].to_i ==7
        return "six" if split_num[0].to_i ==6
        return "five" if split_num[0].to_i ==5
        return "four" if split_num[0].to_i ==4
        return "three" if split_num[0].to_i ==3
        return "two" if split_num[0].to_i ==2
        return "one" if split_num[0].to_i ==1
        return "" if split_num[0].to_i == 0
      end
    end
  end
end

puts (1..1000).inject(0){|sum, n| sum += n.to_long_string.delete(" ").length }