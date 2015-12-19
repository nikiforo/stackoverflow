package stackoverflow.q34352315

import org.scalatest.FunSuite

class HisClassTest extends FunSuite{
  test("WAT"){
    val desmurfer = new HisClass("_smurf_")
    val iterator: Iterator[Char] = "Scala_smurf_is_smurf_great_smurf__smurf_".iterator

    assert(desmurfer.nextString(iterator) == Some("Scala"))
    assert(desmurfer.nextString(iterator) == Some("is"))
    assert(desmurfer.nextString(iterator) == Some("great"))
    assert(desmurfer.nextString(iterator) == Some(""))
    assert(desmurfer.nextString(iterator) == None)

    assert(desmurfer.nextString("FooBarBaz".iterator) == Some("FooBarBaz"))
    assert(desmurfer.nextString("".iterator) == None)

  }
}
