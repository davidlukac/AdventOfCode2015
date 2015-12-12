package com.gaincore.adventofcode

import io.Source

/**
  * Created by davidlukac on 11/12/15.
  */
object Day01Challenge01a {

  def main(args: Array[String]) {
    val file = "assets/input_01-01.txt"

    val counter = new FloorCounter

    Source.fromFile(file).foreach {
      // i => println(i)
      i => counter.parentheses(i)
    }

    println("The final floor is:" + counter.getCounter)
  }

}
