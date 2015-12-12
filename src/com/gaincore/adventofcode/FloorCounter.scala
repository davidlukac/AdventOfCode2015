package com.gaincore.adventofcode

/**
  * Created by davidlukac on 12/12/15.
  */
class FloorCounter {

  private var floor = 0
  private var basementFlag = false
  private var moveCounter = 0
  private var basementMovePosition = 0

  def parentheses(c: Char) = {
    this.moveCounter += 1
    if (c == '(') {
      this.floor += 1
    }
    else if (c == ')') {
      this.floor -= 1
      if (this.basementFlag.equals(false) && this.floor.<(0)) {
        this.basementFlag = true
        this.basementMovePosition = this.moveCounter
      }
    }
  }

  def getFinalFloor = {
    this.floor
  }

  def getBasementPosition = {
    this.basementMovePosition
  }

}
