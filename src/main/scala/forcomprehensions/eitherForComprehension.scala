package forcomprehensions

@main def eitherForComprehension(): Unit =
  def parse(str: String): Either[String, Int] =
    if str.matches("\\d+") then Right(str.toInt)
    else Left(s"Not a number: $str")

  val result = for
    a <- parse("10")
    b <- parse("20")
  yield a + b

  println(result) // Right(30)