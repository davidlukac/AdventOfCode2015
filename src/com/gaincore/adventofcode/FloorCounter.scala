package com.gaincore.adventofcode

/**
  * Created by davidlukac on 12/12/15.
  */
class FloorCounter {

  private var counter = 0

  def parentheses(c: Char) = {
    if (c == '(') {
      this.counter += 1
    }
    if (c == ')') {
      this.counter -= 1
    }
  }

  def getCounter = {
    this.counter
  }

}
