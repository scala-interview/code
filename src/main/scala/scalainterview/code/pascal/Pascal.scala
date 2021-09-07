package scalainterview.code.pascal

trait Pascal {

  /**
   *  In mathematics, Pascal's triangle is a triangular array of the binomial coefficients.
   *  It looks like this:
   *       1
   *      1 1
   *     1 2 1
   *    1 3 3 1
   *   1 4 6 4 1
   *  1 5 10 10 5 1
   *
   *  Each element is the sum of the two elements above it.
   *
   *  Let E(i,j) be the jth element of the ith row so E(1,1)=1, E(5,2)=4
   *  Implement a function calculateIJth which calculates the value E(i,j)
   */
  def calculateIJth(i: Int, j: Int): Int

}
