package collections.immutable

@main def immutableMapExample(): Unit =
  val map = Map("a" -> 1, "b" -> 2)
  val newMap = map + ("c" -> 3)

  println(s"Original: $map")   // Map(a -> 1, b -> 2)
  println(s"New: $newMap")     // Map(a -> 1, b -> 2, c -> 3)