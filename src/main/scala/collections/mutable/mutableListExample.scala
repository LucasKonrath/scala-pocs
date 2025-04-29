package collections.mutable

import scala.collection.mutable.ListBuffer

@main def mutableListExample(): Unit =
  val listBuf = ListBuffer(1, 2, 3)
  listBuf += 4
  listBuf ++= List(5, 6)

  println(s"Mutable list buffer: $listBuf") // ListBuffer(1, 2, 3, 4, 5, 6)