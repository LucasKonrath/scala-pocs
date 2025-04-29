package monads

@main def runOption(): Unit =
  val maybeName: Option[String] = Some("Alice")
  val maybeAge: Option[Int] = Some(30)
  
  val result: Option[String] = for
    name <- maybeName
    age  <- maybeAge
  yield s"$name is $age years old"
  
  println(result) // Some("Alice is 30 years old")