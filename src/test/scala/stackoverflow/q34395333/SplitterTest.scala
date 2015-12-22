package stackoverflow.q34395333

import org.scalatest.FunSuite

class SplitterTest extends FunSuite{
  test("Simple"){
    val t = Splitter.splitAndAccumulate("1.2.3")

    val answers = Seq("1", "1.2", "1.2.3")

    t.zip(answers).foreach{ case (l, r) =>
      assert(l == r)
    }
  }

  test("one element length"){
    val t = Splitter.splitAndAccumulate("1")

    val answers = Seq("1")

    assert(t.head == answers.head)
  }
}
