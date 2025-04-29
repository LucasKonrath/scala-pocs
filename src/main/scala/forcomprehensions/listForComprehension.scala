package forcomprehensions

@main def listForComprehension(): Unit =
  val nums = List(1, 2)
  val letters = List("a", "b")

  val result = for
    n <- nums
    l <- letters
  yield s"$n$l"

  println(result) // List("1a", "1b", "2a", "2b")