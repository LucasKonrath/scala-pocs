package functions

object Functions {
  def add(x: Int, y: Int): Int = {
    x + y
  }

  def square(x: Int): Int = x * x

  def implicitReturn() = "Hello"

  def explicitReturn() : String = "Hello"

  def max(a: Int, b: Int): Int = if (a > b) a else b

  def defaultParameter(name: String = "World"): String = "Hello, " + name

  private def namedParameters(name: String, age: Int, city: String): String = s"$name, $age years old, from $city"

  namedParameters(age = 30, city = "New York", name = "John")

  def varargsSum(numbers: Int*): Int = numbers.sum

  val anonymousFunction: Int => Int = (x: Int) => x * 2

  def higherOrder(f: Int => Int, value: Int): Int = f(value)

  def curriedAdd(x: Int) (y: Int): Int = x + y
  val five = curriedAdd(5)
  val fifteen = five(10)

  def tryCatchHandling(x: Int, y: Int): Option[Double] = {
    try {
      Some( x / y.toDouble)
    } catch
      case _: ArithmeticException => None
  }

}
