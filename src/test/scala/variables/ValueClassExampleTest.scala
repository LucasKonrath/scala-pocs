package variables

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import variables.ValueClassExample

/** @version 1.1.0 */
class ValueClassExampleTest extends AnyFunSuite with Matchers {
  test("Example!") {
    new ValueClassExample(30).multBy10 should be (300.0)
  }
}