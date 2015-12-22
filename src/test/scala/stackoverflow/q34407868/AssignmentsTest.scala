package stackoverflow.q34407868

import org.scalatest.FunSuite

import scala.collection.mutable

class AssignmentsTest extends FunSuite{
  test("map assignments"){
    val map = mutable.Map[Int, Int]().withDefaultValue(0)
    assert(map(1) == 0)
    assert(map(2) == 0)

    map(1) = 10
    assert(map(1) == 10)
    assert(map(2) == 0)

    map(1) += 10
    assert(map(1) == 20)
    assert(map(2) == 0)
  }
  test("Phonebook"){
    val phonebook = new PhoneBook

    phonebook("Lopik") = "+79781234567"
    assert(phonebook("Lopik") == "+79781234567")
  }
}
