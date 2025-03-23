package classes.inheritance.`trait`

import classes.inheritance.Animal

class Vulture(name: String) extends Animal(name) with Flyable {
  override def sound(): String = "aaaaaaaaaaaaaaaaaa"


  Vulture("Test Vulture").sound()
  Vulture("Test Vulture").fly()
}

