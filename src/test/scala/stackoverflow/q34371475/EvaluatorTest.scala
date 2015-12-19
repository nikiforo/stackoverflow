package stackoverflow.q34371475

import org.scalatest.FunSuite

class EvaluatorTest extends FunSuite {
  test("1+1=2"){
    assert(Evaluator.evaluate(Evaluatee(1, "+", 1)) == 2)
  }
  test("2-1=1"){
    assert(Evaluator.evaluate(Evaluatee(2, "-", 1)) == 1)
  }
  test("1+1=2 raw"){
    assert(Evaluator.raw("+")(1,1) == 2)
  }
}
