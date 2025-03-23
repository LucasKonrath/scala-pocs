package classes

// Optional parameters
class Point(private var x: Int = 0, var y: Int = 0):
  def move(dx: Int, dy: Int) : Unit =
    x = x + dx
    y = y + dy

end Point

val point1 = Point(2, 3)
val pointy = Point(y = 3)
val pointx = Point(x = 2)