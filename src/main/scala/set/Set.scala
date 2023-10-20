package set

abstract class Set:

  def add(x: Int): Set

  def contains(x: Int): Boolean

  def height(): Int

  def weight(): Int
