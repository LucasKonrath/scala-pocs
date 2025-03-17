package variables

class testLocalVar {
  def example(): Unit = {
    var localVar = 10
    println(localVar)
  }

  // doesnt exist here
  // println(localVar)
}