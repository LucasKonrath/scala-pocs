package variables

object ImmutableCollections {
  val numbers = List(1, 2, 3)
  val newNumbers = numbers.map(_ * 2) // multiply all numbers by 2
  println(numbers)
  println(newNumbers)
}