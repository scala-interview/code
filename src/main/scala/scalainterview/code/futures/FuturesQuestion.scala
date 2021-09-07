package scalainterview.code.futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object FuturesQuestion extends App {

  def someNumbers = List(3000, 1200, 1800, 600, 250, 1000, 1100, 8000, 550)

  def taskFutures: List[Future[String]] = someNumbers map { ms =>
    Future {
      Thread sleep ms
      s"Task completed in $ms ms"
    }
  }

  val allValuesEventually: Future[List[String]] = ???  // complete this please

  val x = Await.result(allValuesEventually, 30.seconds)
  x.foreach(println)

}
