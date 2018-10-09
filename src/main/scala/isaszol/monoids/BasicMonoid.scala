package isaszol.monoids

object BasicMonoid {


  trait Monoid[A] {

    def op(a1: A, a2: A): A

    def zero: A

  }

  val IntAddition = new Monoid[Int] {

    override def op(a1: Int, a2: Int): Int = a1 + a2

    override val zero = 0

  }

  val BooleanOr: Monoid[Boolean] = new Monoid[Boolean] {

    override def op(a1: Boolean, a2: Boolean): Boolean = a1 || a2

    override val zero: Boolean = false
  }

  def optionMonoid[A]: Monoid[Option[A]] = new Monoid[Option[A]] {

    override def op(a1: Option[A], a2: Option[A]): Option[A] = a1 orElse a2

    override def zero: Option[A] = None
  }

  def endoMonoid[A]: Monoid[A => A] = new Monoid[A => A] {

    override def op(a1: A => A, a2: A => A): A => A = a1 andThen a2

    override def zero: A => A = identity[A]
  }
}
