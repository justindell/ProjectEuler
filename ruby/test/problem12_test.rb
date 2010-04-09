require 'src/problem12'
require 'test/unit'

class Problem12Test < Test::Unit::TestCase
  def test_solution
    assert_equal 28, Problem12.triangle_number_with_most_factors(5, 7), "Sample Solution Failed"
    assert_equal 76576500, Problem12.triangle_number_with_most_factors(500, 1000000),
      "Actual Solution Failed"
  end
end
