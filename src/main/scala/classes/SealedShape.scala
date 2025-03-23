package classes

// Sealed classes can only be subclassed in the same file

sealed class SealedShape

class Circle(radius: Double) extends SealedShape
class Square(side: Double) extends SealedShape