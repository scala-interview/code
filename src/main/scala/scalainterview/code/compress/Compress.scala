package scalainterview.code.compress

trait Compress {

  /**
   * Eliminate consecutive duplicates of list elements. If a list contains repeated elements they should
   * be replaced with a single copy of the element. The order of the elements should not be changed.
   *
   * For example if provided with the List (1, 2, 2, 1) the function will return List(1, 2, 1)
   */
  def compress[A](xs: List[A]): List[A]

}
