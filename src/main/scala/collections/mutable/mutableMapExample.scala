package collections.mutable

import scala.collection.mutable.Map

@main def mutableMapExample(): Unit =
  val map = Map("a" -> 1, "b" -> 2)
  map += ("c" -> 3)
  map("b") = 20

  println(s"Mutable map: $map") // Map(a -> 1, b -> 20, c -> 3)