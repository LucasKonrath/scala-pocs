package collections.immutable

@main def immutableSetExample(): Unit =
  val set = Set(1, 2, 3)
  val newSet = set + 4

  println(s"Original: $set")   // Set(1, 2, 3)
  println(s"New: $newSet")     // Set(1, 2, 3, 4)