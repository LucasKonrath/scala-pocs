package variables

class ValueClassExample(val example: Double) extends AnyVal {
  def multBy10: Double = example * 10
}