package common.helpers

object ImplicitConversions {

  implicit class OptionConverter[T](x: java.util.Optional[T]) {
    def asScala: Option[T] = {
      if (x.isPresent) Some[T](x.get())
      else Option.empty[T]
    }
  }

}
