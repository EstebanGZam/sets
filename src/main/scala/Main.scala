import set.*

object Main:
  def main(args: Array[String]): Unit =
    println("¡Hello world!")
    val set1 = new NonEmpty(15, new NonEmpty(10, new Empty(), new Empty()), new NonEmpty(18, new Empty(), new Empty()))
    println(set1)
    println(set1.height())
    println(set1.weight())
