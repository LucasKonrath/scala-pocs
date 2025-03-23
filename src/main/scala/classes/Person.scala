package classes

case class Person(name: String, age: Int) {

  // Constructor
  val p = Person("Test", 10)

  // Pattern Matching
  p match
    case Person(x, y) => s"Name: $x, Age: $y"


  // Copy
    val p2 = p.copy()
}

