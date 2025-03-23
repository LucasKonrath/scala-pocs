package classes

class Secret private(val key: String):
  val secret = new Secret("test")
end Secret

// non-accessible
//val secret = new Secret()