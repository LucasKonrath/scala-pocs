package monads

@main def runListExample(): Unit =
  val list1 = List(1, 2)
  val list2 = List(10, 20)

  val result: List[Int] = for
    a <- list1
    b <- list2
  yield a + b

  println(result) // Output: List(11, 21, 12, 22)