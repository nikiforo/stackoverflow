package stackoverflow.q34377615

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object fooService{
  def getA() = {
    Future{
      println("I'm getA")
      for(i <- 1 to 10){
        println(".")
        Thread.sleep(200)
      }
      "A"
    }
  }
  def getB() = {
    Future{
      println("I'm getB")
      for(i <- 1 to 10){
        println(".")
        Thread.sleep(200)
      }
      "B"
    }
  }
}

object Main {
  def main(args: Array[String]) ={
    for {
      a <- fooService.getA()
      b <- fooService.getB()
    } println(a + b)

    Thread.sleep(4000)
  }
}
