package isaszol.hofs

import isaszol.hofs.Sorted.isSorted
import org.scalatest.{Matchers, WordSpec}

class SortedSpec extends WordSpec with Matchers {

  /** Canned ordering rules **/
  private val StringAsc: (String, String) => Boolean = (a, b) => a < b
  private val StringDesc: (String, String) => Boolean = (a, b) => a < b
  private val IntAsc: (Int, Int) => Boolean = (a, b) => a < b

  "An array" can {

    "empty" should {
      "always sorted " in {
        isSorted(Array.empty[String], StringAsc) shouldBe true
        isSorted(Array.empty[String], StringDesc) shouldBe true
      }
    }
    "single element array" should {
      "always sorted" in {
        isSorted(Array("xyz"), StringAsc) shouldBe true
        isSorted(Array("xyz"), StringDesc) shouldBe true
      }
    }
    "two elements array" should {
      "sorted in case of ordered String array" in {
        isSorted(Array("a", "b"), StringAsc) shouldBe true
      }
      "not be sorted for a String array in desc" in {
        isSorted(Array("b", "a"), StringAsc) shouldBe false
      }
      "sorted in case of ordered Int array" in {
        isSorted(Array(1, 2), IntAsc) shouldBe true
      }
      "not be sorted for an Int array in desc" in {
        isSorted(Array(2, 1), IntAsc) shouldBe false
      }
    }

    "three elements array" should {
      "sorted in case of ordered String array" in {
        isSorted(Array("a", "b", "c"), StringAsc) shouldBe true
      }
      "not be sorted for a String array in desc" in {
        isSorted(Array("b", "c", "a"), StringAsc) shouldBe false
      }
      "sorted in case of ordered Int array" in {
        isSorted(Array(1, 2, 3), IntAsc) shouldBe true
      }
      "not be sorted for an Int array in desc" in {
        isSorted(Array(2, 3, 1), IntAsc) shouldBe false
      }
    }
  }

}
