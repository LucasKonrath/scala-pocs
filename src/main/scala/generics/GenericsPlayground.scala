package generics

class Container[A](value: A) {
  def open: A = value
}

@main
def main(): Unit = {
  val intContainer = new Container[Int](10)
  val stringContainer = new Container[String]("100")
  println(intContainer.open)
  println(stringContainer.open)
  println(genericParam(42))
  println(genericParam("String"))
  val pair = new Pair("Apple", 10)
}

def genericParam[T](param: T): T = param

class Pair[A, B](val first: A, val second: B)

class Vehicle {
  def run(): Unit = println("Running")
}

class Car extends Vehicle {
  override def run(): Unit = println("Vroom vroom")
}

// A must be a subtype of vehicle
class Garage[A <: Vehicle](vehicle: A) {
  def store() : Unit = println(s"Storing $vehicle")
}

// A must be super type of Int
class IntSum[A >: Int, B >: Int](one: A, two: B) {

}

// TODO Add variance