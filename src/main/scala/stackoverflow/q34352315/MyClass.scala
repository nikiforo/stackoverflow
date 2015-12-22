package stackoverflow.q34352315

class MyClass(s: String) {
  def nextString(iterator: Iterator[Char]): Option[String] = {
    val t = iterator.toStream

    val index = t.indexOfSlice(s)

    if(t.isEmpty) None
    else if(index == -1) Some(t.mkString)
    else Some(t.slice(0,index).mkString)
  }
}
