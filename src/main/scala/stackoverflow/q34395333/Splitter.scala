package stackoverflow.q34395333

object Splitter {
  def splitAndAccumulate(string: String) = {
    val s = string.split("\\.")

    s.tail.scanLeft(s.head){ case (acc, elem) =>
      acc + "." + elem
    }
  }
}
