package stackoverflow.q34371475

case class Evaluatee(v1: Int, operator: String, v2: Int)

object Evaluator {
  def raw(s: String)(v1: Int, v2: Int) = s match {
      case "+" => (v1 + v2)
      case "-" => (v1 - v2)
      case "*" => (v1 * v2)
      case "/" => (v1 / v2)
  }

  def evaluate(evaluatee: Evaluatee) =
    raw(evaluatee.operator)(evaluatee.v1, evaluatee.v2)
}
