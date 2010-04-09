require 'test/unit'
require 'src/problem14'

class Problem14Test < Test::Unit::TestCase
  def test_sample
    prob = Problem14.new
    assert_equal 9, prob.get_longest_chain(13), "Sample wrong"
  end

  def test_solution
    prob = Problem14.new
    assert_equal 837799, prob.get_longest_chain(1000000), "Actual wrong"
  end
end
