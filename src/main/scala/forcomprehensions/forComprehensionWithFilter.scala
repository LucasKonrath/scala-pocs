package forcomprehensions

@main def forComprehensionWithFilter(): Unit =
  val nums = List(1, 2, 3, 4, 5)

  val evenSquares = for
    n <- nums
    if n % 2 == 0
  yield n * n

  println(evenSquares) // List(4, 16)