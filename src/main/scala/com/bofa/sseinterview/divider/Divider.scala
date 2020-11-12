package com.baml.gmrt.elt.sse.interview.divider

/**
  * Given Int n, divide the integers from 1 to 100 into 2 groups - those that are divisible by n and those that are not
  */
trait Divider {

  /**
    *
    * @return a list of ints from 1 to 100
    */
  def ints: List[Int]

  /**
    *
    * @param n an integer used to partition the integers between 1 and 100
    * @return 2 Lists, the first of which should contain integers divisible by n and the second, integers indivisible by n
    */
  def divide(n: Int): (List[Int], List[Int])
}

