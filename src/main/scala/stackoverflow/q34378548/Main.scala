package stackoverflow.q34378548

object Main {
  "ean" -> longNumber.verifying("validation.ean.duplicate", Product.findByEan(_).isEmpty)
}

object longNumber {
  def verifying(s: String, f: String => Boolean): String = ???
}

object Product{
  def findByEan(s: String): Seq[Int] = ???
}