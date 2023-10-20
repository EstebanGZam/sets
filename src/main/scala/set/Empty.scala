package set

class Empty extends Set:
  override def contains(x: Int): Boolean = false

  override def add(x: Int): Set = new NonEmpty(x, new Empty, new Empty)

  override def toString: String = ""

  override def height(): Int = 0

  override def weight(): Int = 0