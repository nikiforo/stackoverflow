package stackoverflow.q34352315

class HisClass(str: String) {
  def nextString(iterator: Iterator[Char]): Option[String] = {
    val sb = new StringBuilder
    if(!iterator.hasNext) return None
    while (iterator.hasNext) {
      sb.append(iterator.next())
      if (sb.endsWith(str)) return Some(sb.stripSuffix(str))
    }
    Some(sb.toString())
  }
}