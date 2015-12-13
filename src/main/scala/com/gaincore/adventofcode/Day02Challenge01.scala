package com.gaincore.adventofcode

import scala.io.Source

/**
  * Created by David Lukac on 12/12/15.
  */
object Day02Challenge01 {

  def main(args: Array[String]) {
    val file = "/input_02-01.txt"

    val wrapper = new WrapperCalculator

    Source.fromInputStream(getClass.getResourceAsStream(file)).getLines.foreach {
      line => wrapper.wrap(line.split("x").map(_.toInt))
    }

    println("Elves will need " + wrapper.getTotalPaper + " square feet of wrapping paper and " + wrapper.getTotalRibbon + " feet of ribbon.")
  }

}
