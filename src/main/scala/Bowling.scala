object Bowling {
  def score(throws: Seq[Int]): Int = {
    def isSpare(a: Int, b: Int): Boolean = a + b == 10

    def isStrike(a: Int): Boolean = a == 10

    throws match {
      case Nil => 0
      case a :: b :: c :: xs if isStrike(a) => a + b + c + score(b +: c +: xs)
      case a :: b :: c :: xs if isSpare(a, b) => a + b + c + score(c +: xs)
      case x :: xs => x + score(xs)
    }
  }
}
