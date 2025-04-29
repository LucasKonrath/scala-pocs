package monads

trait OptionMonad[F[_]]:
  def pure[A](value: A): Option[A] = Some(value)
  def flatMap[A, B](fa: Option[A])(f:A => Option[B]) : Option[B] =
    fa match
      case Some(a) => f(a)
      case None => None
