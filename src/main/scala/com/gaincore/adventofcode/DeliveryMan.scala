package com.gaincore.adventofcode

/**
  * Created by David Lukac on 13/12/15.
  */
class DeliveryMan {

  // Initialisation with default [0, 0] position.
  var position: XYPosition = new XYPosition(0, 0)
  var name: String = "Name-less delivery man"

  def this(namec: String) = {
    this
    this.name = namec
  }

}
