package stackoverflow.q34390175

object SecondMain {
  def test(testString:String): Boolean = {
    if(testString == "Chennai"){
      println("correct")
      return true
    }

    println("outside if")

    false
  }
}
