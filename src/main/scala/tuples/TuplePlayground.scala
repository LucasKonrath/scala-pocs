package tuples

val tuple2 = ("Scala", "Tuple")
val tuple22 = (1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

// Tuples are one-indexed

@main
def main(): Unit = {
  println(tuple2._1)
  println(tuple2._2)

  println(tuple22)

  val (lang, structure) = tuple2

  println(s"Lang: $lang, Structure: $structure")

  val (username, userAge) = getUserInfo
  println(s"User: $username, Age: $userAge")

  val cars = Map(
    "VW" -> "Golf",
    "BMW" -> "32Oi"
  )

  for ((make, car) <- cars) {
    println(s"$make : $car")
  }


  // SWAP
  val swapped = tuple2.swap

}

// function returning tuple
def getUserInfo: (String, Int) = {
  val name = "Charlie"
  val age = 40
  (name, age)  // returning a Tuple2
}