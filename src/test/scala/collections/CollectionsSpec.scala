package collections

import collections.Collections._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CollectionsSpec extends AnyFlatSpec with Matchers {
  "findGaps" should "find all pairs of neighboring elements with a gap betweent them" in {
    findGaps(Seq(1, 3, 4, -10, 5)) shouldEqual Some(Seq((1, 3), (4, -10), (-10, 5)))
  }

  it should "return None if difference between any two neighboring numbers equal to 1" in {
    findGaps(Seq(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1)) shouldEqual None
  }

  "minFold/minReduce/minRecursion" should "return key-value pair with the minimum value" in {
    val map = Map(
      "Donkey" -> Int.MinValue,
      "Shrek" -> 5,
      "Fiona" -> 134513,
      "Farquad" -> Int.MaxValue,
      "Batya" -> 1337,
      "Mama" -> 322
    )
    minFold(map) shouldEqual Some("Donkey" -> Int.MinValue)
    minReduce(map) shouldEqual Some("Donkey" -> Int.MinValue)
    minRecursion(map) shouldEqual Some("Donkey" -> Int.MinValue)
  }

  it should "return None if the map is empty" in {
    minFold(Map.empty) shouldEqual None
    minReduce(Map.empty) shouldEqual None
    minRecursion(Map.empty) shouldEqual None
  }

  "scanLeft" should "return a running total" in {
    val intSequence = Seq(1, 2, 3, 4, 5)
    scanLeft(0)(intSequence)(_ + _) shouldEqual Seq(0, 1, 3, 6, 10, 15)
    val stringSequence = Seq("Shrek", "and", "donkey", "are", "best", "friends", "forever")
    scanLeft("")(stringSequence)(_ + " " + _) shouldEqual Seq(
      "",
      " Shrek",
      " Shrek and",
      " Shrek and donkey",
      " Shrek and donkey are",
      " Shrek and donkey are best",
      " Shrek and donkey are best friends",
      " Shrek and donkey are best friends forever"
    )
  }

  "count" should "work to pass the interview" in {
    count("aaaabbbcca") shouldEqual List('a' -> 4, 'b' -> 3, 'c' -> 2, 'a' -> 1)
  }
}
