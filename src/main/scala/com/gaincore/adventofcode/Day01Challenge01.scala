package com.gaincore.adventofcode

import io.Source

/**
  * Created by David Lukac on 11/12/15.
  */
object Day01Challenge01 {

  def main(args: Array[String]) {
    val file = "/input_01-01.txt"

    val counter = new FloorCounter

    Source.fromInputStream(getClass.getResourceAsStream(file)).foreach {
      i => counter.parentheses(i)
    }

    println("Day 01")
    println("  Puzzle 01: The final floor is: " + counter.getFinalFloor)
    println("  Puzzle 02: For the 1st time we went to basement on move number: " + counter.getBasementPosition)
  }

}
