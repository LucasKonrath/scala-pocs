package monads

@main def runMapExample(): Unit =
  val myMap = Map(1 -> "one", 2 -> "two")

  // map: transform values
  val upperMap = myMap.map { case (k, v) => (k, v.toUpperCase) }
  println(s"Uppercased values: $upperMap") // Map(1 -> "ONE", 2 -> "TWO")

  // flatMap: expand each entry into more entries
  val expanded = myMap.flatMap {
    case (k, v) => List((k, v), (k + 10, v + "!"))
  }

  println(s"Expanded map: $expanded") // Map(1 -> "one", 11 -> "one!", 2 -> "two", 12 -> "two!")