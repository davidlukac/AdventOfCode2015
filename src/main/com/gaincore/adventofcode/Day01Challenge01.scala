package com.gaincore.adventofcode

import io.Source

/**
  * Created by davidlukac on 11/12/15.
  */
object Day01Challenge01 {

  def main(args: Array[String]) {
    val file = "assets/input_01-01.txt"

    val counter = new FloorCounter

    Source.fromFile(file).foreach {
      i => counter.parentheses(i)
    }

    println("The final floor is:" + counter.getFinalFloor)
    println("For the 1st time we went to basement on move number: " + counter.getBasementPosition)
  }

}
