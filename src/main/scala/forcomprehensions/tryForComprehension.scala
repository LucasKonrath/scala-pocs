package forcomprehensions

import scala.util.{Try, Success, Failure}

@main def tryForComprehension(): Unit =
  def parseInt(str: String): Try[Int] = Try(str.toInt)

  val result: Try[Int] = for
    a <- parseInt("10")
    b <- parseInt("oops")  // Fails here
  yield a + b

  println(result) // Failure(java.lang.NumberFormatException)