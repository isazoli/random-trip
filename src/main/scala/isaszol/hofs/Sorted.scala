package isaszol.hofs

object Sorted {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    as match {
      case emptyArray if emptyArray.isEmpty => true
      case singleElementArray@Array(_) => true
      case xs => xs.sliding(2, 1).forall { case Array(a, b) => ordered(a, b) }
    }
  }

}
