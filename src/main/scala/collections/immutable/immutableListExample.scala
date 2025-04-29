package collections.immutable

@main def immutableListExample(): Unit =
  val list = List(1, 2, 3)
  val newList = list :+ 4 // Appends 4

  println(s"Original: $list")   // List(1, 2, 3)
  println(s"New: $newList")     // List(1, 2, 3, 4)