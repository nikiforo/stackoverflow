package stackoverflow.q34375552

abstract class Learnable {
  val classifier = 1
  val classifierWithVal = classifier
  def classifierWithDef = classifier
  lazy val classifierWithLazyVal = classifier
  var classifierWithVar = classifier
}

object someClassifier extends Learnable {
  override val classifier = 2
}

object InitializationOrder {
  def main(args: Array[String]): Unit = {
    println(someClassifier.classifier) // expect and print 2
    println(someClassifier.classifierWithDef) // expected and printed 2
    println(someClassifier.classifierWithLazyVal) // expected and printed 2
    println(someClassifier.classifierWithVal) // expected 1, but printed 0
    println(someClassifier.classifierWithVar) // expected 1, but printed 0
  }
}