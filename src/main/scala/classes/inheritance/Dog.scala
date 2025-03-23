package classes.inheritance

class Dog(name: String, breed: String) extends Animal(name) {
  override def sound(): String = "Auau"
}
