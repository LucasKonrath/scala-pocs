package forcomprehensions

import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}
import scala.concurrent.duration.*
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global

@main def futureForComprehension(): Unit =
  val future1 = Future(10)
  val future2 = Future(20)

  val result = for
    a <- future1
    b <- future2
  yield a + b

  result.onComplete {
    case Success(value) => println(s"Result: $value")
    case Failure(e)     => println(s"Error: $e")
  }

  // Wait for the result (not needed in real apps)
  Await.result(result, 2.seconds)