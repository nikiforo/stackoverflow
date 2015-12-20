package stackoverflow.q34373571

import org.scalatest.FunSuite

class IterateMapTest extends FunSuite {
  test("Simple"){
    val t = Map[Long, Any](1L -> "one", 2L -> 2, 3L -> 3)

    assert(IterateMap.thirdCaseClauseOfEquals(DirectTaskResult(t)) == true)
    assert(IterateMap.thirdCaseClauseOfEquals(DirectTaskResult(t + (4L -> "Four"))) == true)
    assert(IterateMap.thirdCaseClauseOfEquals(DirectTaskResult(t - 1L)) == false)
  }

}
