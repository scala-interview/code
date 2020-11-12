package com.bofa.sseinterview.calculator

trait Calculator {

  /**
   * Implement a calculator that is able to evaluate a string containing digits, addition symbols
   * and minus symbols.
   * For example [[evaluate("3+4-5")]] should return Right(2). Any string
   * that does not conform to the expectation should return an error message.
   */
  def evaluate(expression: String): Either[String, Int]
}
