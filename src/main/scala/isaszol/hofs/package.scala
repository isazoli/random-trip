package isaszol

package object hofs {

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = f(a, _)

}
