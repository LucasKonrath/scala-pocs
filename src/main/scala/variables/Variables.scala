package variables

object Variables {
  val immutable = 42
  // This is immutable, this will cause compilation error
  // immutable = 10

  private var mutable = 42
  mutable = 10


  val a = 5 // Inferred as Int
  val b = "hello" // Inferred as String

}
