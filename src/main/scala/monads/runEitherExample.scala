package monads

@main def runEitherExample(): Unit =
  def parse(str: String): Either[String, Int] =
    if str.matches("\\d+") then Right(str.toInt)
    else Left(s"Not a number: $str")

  val result = for
    a <- parse("10")
    b <- parse("20")
  yield a + b

  println(s"Success case: $result") // Right(30)

  val result2 = for
    a <- parse("10")
    b <- parse("oops")
  yield a + b

  println(s"Failure case: $result2") // Left("Not a number: oops")