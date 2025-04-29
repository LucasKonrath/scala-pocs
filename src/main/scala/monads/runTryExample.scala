package monads

import scala.util.{Try, Success, Failure}

@main def runTryExample(): Unit =
  def parseInt(str: String): Try[Int] = Try(str.toInt)

  val result = for
    a <- parseInt("10")
    b <- parseInt("5")
  yield a + b

  println(s"Success case: $result") // Success(15)

  val result2 = for
    a <- parseInt("10")
    b <- parseInt("oops") // Not an int
  yield a + b

  println(s"Failure case: $result2") // Failure(java.lang.NumberFormatException)