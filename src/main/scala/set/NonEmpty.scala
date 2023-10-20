package set

class NonEmpty(element: Int, left: Set, right: Set) extends Set:

  def contains(x: Int): Boolean =
    if (x < element) left contains x
    else if (x > element) right contains x
    else true

  def add(x: Int): Set =
    if (x < element) new NonEmpty(element, left add x, right)
    else if (x > element) new NonEmpty(element, left, right add x)
    else this

  override def height(): Int = 1 + Math.max(left.height(), right.height())

  override def toString: String = s"$left $element $right"

  override def weight(): Int = 1 + left.weight() + right.weight()
