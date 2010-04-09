require 'test/unit'
require 'src/problem15'

class Problem15Test < Test::Unit::TestCase
  def setup
    @prob = Problem15.new
  end

  def test_sample
    assert_equal 6, @prob.num_paths(2,2), "sample failed"
  end

  def test_solution
    assert_equal 137846528820, @prob.num_paths(20,20), "actual failed"
  end
end
