package monads

import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.Await

@main def runFutureExample(): Unit =
  val future1 = Future(10)
  val future2 = Future(20)

  val result: Future[Int] = for
    a <- future1
    b <- future2
  yield a + b

  result.onComplete {
    case Success(value) => println(s"Result: $value") // Result: 30
    case Failure(e)     => println(s"Error: $e")
  }

  // Wait for async result (only needed in simple scripts)
  Await.result(result, 2.seconds)