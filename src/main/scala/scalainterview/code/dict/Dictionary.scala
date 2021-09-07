package scalainterview.code.dict

/**
  * Task:
  * (i) Implement @see Dictionary#allWords
  * This should read all the words from resource words.txt and return them in a list.
  *
  * (ii) Implement @see Dictionary#wordsMatchingAllPredicates It should return a subset of allWords which matches all the given predicates.
  * Allow for predicates:
  * a. length = n
  * b. letter at index n is l
  */
trait Word {
  //This should have a sensible representation
  override def toString: String
}

trait Predicate {
  def matches(word: Word): Boolean
}

trait Dictionary {
  def allWords: List[Word]
  def wordsMatchingAllPredicates(predicates: Predicate*): List[Word]
}