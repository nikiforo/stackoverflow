package stackoverflow.q34407868

import scala.collection.mutable

class PhoneBook {
  val numbers = mutable.Map.empty[String,String]

  def apply(s: String): String = numbers(s)
  def update(key: String, value: String) = numbers(key) = value
}
