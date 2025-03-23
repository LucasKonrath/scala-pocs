package patternMatching

class BasicValueMatching

val number = 30

val result = number match {
  case 0 => "Zero"
  case _ => "Not Zero"
}

case class Person(name: String, age:Int) {

}

val person = Person("James", 30)

val description = person match {
  case Person("James", age) => s"Valtteri, it's James"
  case Person(name, age) => s"$name $age years old"
}

val age = 20

val ageResult = age match {
  case n if n >= 18 => "Adult"
  case n if n < 18 => "Non-Adult"
}

val nums = List(1, 2, 3, 4, 5)

val numsResult = nums match {
  case Nil => "Empty"
  case head :: tail => s"Head:  $head, Tail: $tail"
  case List(one) => s"Only one element: $one"
  case List(a, b, c, d, e) => s"Five elements: $a, $b, $c, $d, $e"
}

val maybe : Option[String] = Some("maybe")

val maybeResult = maybe match {
  case Some(value) => value
  case None => None
}