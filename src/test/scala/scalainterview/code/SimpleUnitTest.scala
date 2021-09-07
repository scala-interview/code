package scalainterview.code

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class SimpleUnitTest extends AnyFreeSpec with Matchers {
  "double revere should be the same" in {
    val data = 1 to 10 to List
    data.reverse should not be data
    data.reverse.reverse shouldBe data
  }
}
