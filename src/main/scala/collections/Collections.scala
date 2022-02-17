package collections

object Collections {
  /*
    В отсортированном листе найти все пары соседних числе, между которыми разница больше 1
    None for Seq(1, 2, 3, 4)
    Some(Seq((2, 8))) for Seq(1, 2, 8)
    Some(Seq((3, 5), (5, 7))) for Seq(3, 5, 7)
   */
  def findGaps(l: Seq[Int]): Option[Seq[(Int, Int)]] = {
    ???
  }

  /*
    Найти key-value пару с минимальным значение value в ассоциативном массиве
    Попробуйте реализовать min различными способами (fold, reduce, recursion)
  */
  def minFold(map: Map[String, Int]): Option[(String, Int)] = {
    ???
  }

  def minReduce(map: Map[String, Int]): Option[(String, Int)] = {
    ???
  }

  def minRecursion(map: Map[String, Int]): Option[(String, Int)] = ???

  // Реализуйте scanLeft для последовательностей (не используя функции scan* из стандартной библиотеки)
  def scanLeft[T](zero: T)(list: Seq[T])(f: (T, T) => T): Seq[T] = {
    ???
  }

  // Посчитайте количество каждого последовательно повторяющегося символа в строке
  def count(s: String): List[(Char, Int)] = {
    ???
  }
}
