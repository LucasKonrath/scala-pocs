package collections.mutable

import scala.collection.mutable.Set

@main def mutableSetExample(): Unit =
  val set = Set(1, 2, 3)
  set += 4
  set -= 2

  println(s"Mutable set: $set") // Set(1, 3, 4)