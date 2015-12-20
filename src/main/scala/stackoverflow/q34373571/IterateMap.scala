package stackoverflow.q34373571

case class DirectTaskResult(accumUpdates: Map[Long, Any])

object IterateMap {
  val accumUpdates = Map[Long, Any](1L -> "one", 2L -> 2, 3L -> 3)

  def thirdCaseClauseOfEquals(that: DirectTaskResult) = {
    accumUpdates.keys.forall { key =>
      accumUpdates.get(key) == that.accumUpdates.get(key)
    }
  }
}
