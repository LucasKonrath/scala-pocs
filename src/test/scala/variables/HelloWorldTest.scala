package variables

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import variables.HelloWorld
/** @version 1.1.0 */
class HelloWorldTest extends AnyFunSuite with Matchers {
  test("Say Hi!") {
    HelloWorld.hello() should be ("Hello, World!")
  }
}