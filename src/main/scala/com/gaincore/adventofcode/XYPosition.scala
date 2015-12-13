package com.gaincore.adventofcode

/**
  * Created by David Lukac on 13/12/15.
  */
class XYPosition(xc: Int, yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def this(p: XYPosition) = this(p.x, p.y)

  def goNorth: XYPosition = {
    this.y += 1
    this
  }

  def goEast: XYPosition = {
    this.x += 1
    this
  }

  def goWest: XYPosition = {
    this.x -= 1
    this
  }

  def goSouth: XYPosition = {
    this.y -= 1
    this
  }

  override def toString = {
    s"Current position [x, y] is: [$x, $y]."
  }

  // Custom equals implementation for the positioning.
  override def equals(other: Any): Boolean = other match {
    case that: XYPosition => that.canEqual(this) && (this.x == that.x) && (this.y == that.y)
    case _ => false
  }

  // Equality check for the class itself.
  def canEqual(other: Any): Boolean = other.isInstanceOf[XYPosition]

  // Cookbook implementation of custom `hashCode` method.
  override def hashCode: Int = 41 * (41 + x) + y

}
