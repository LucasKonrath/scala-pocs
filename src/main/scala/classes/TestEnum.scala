package classes

enum TestEnum {
  case ZERO, ONE
  private case ComplexEnum(min: Int, max: Int)

  val c1: TestEnum = TestEnum.ZERO
  private val c2 = TestEnum.ComplexEnum(0, 10)

  c2 match
    case TestEnum.ComplexEnum(min, max) => s"Min $min Max $max"
    case _ => "Basic Enum"
}