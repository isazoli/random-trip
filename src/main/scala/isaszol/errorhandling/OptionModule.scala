package isaszol.errorhandling

object OptionModule {

  sealed trait Option[+A] {

    def map[B](f: A => B): Option[B]

    def flatMap[B](f: A => Option[B]): Option[B]

  }

  case class Some[+A](get: A) extends Option[A] {

    override def map[B](f: A => B): Option[B] = Some(f(get))

    override def flatMap[B](f: A => Option[B]): Option[B] = f(get)
  }

  case object None extends Option[Nothing] {

    override def map[B](f: Nothing => B): Option[B] = None

    override def flatMap[B](f: Nothing => Option[B]): Option[B] = None

  }

  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] =
    for {
      aValue <- a
      bValue <- b
    } yield f(aValue, bValue)


  def sequence[A](a: List[scala.Option[A]]): scala.Option[List[A]] = {
    a.foldLeft[scala.Option[List[A]]](scala.Some(List.empty[A]))(
      (accu, current) => accu.flatMap(a => current.map(a :+ _))
    )
  }

}
