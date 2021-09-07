package scalainterview.code.chess

import Chess.MajorPiece

object Chess {
  sealed trait MajorPiece
  object Queen extends MajorPiece
  object King extends MajorPiece
  object Rook extends MajorPiece
  object Knight extends MajorPiece
  object Bishop extends MajorPiece
}

trait Chess {
  /**
   * Given a chess board of the given dimensions and the given number of pieces, return the number of
   * unique board layouts that may be constructed such that no piece is threatened by any other piece.
   *
   * For example for a 2x3 board with two Kings there are four valid combinations as follows:
   *
   *   K-K    K--    --K    ---
   *   ---    --K    K--    K-K
   */
  def combinations(width: Int, length: Int, pieces: Map[MajorPiece, Int]): Long
}
