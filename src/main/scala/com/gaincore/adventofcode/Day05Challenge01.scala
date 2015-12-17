package com.gaincore.adventofcode

import scala.io.Source

/**
  * Created by David Lukac on 15/12/15.
  */
object Day05Challenge01 {

  val file = "/input_05-01.txt"
  val stringer: NaughtyOrNiceStringer = new NaughtyOrNiceStringer

  def getRawPuzzle01(): Int = {
    0
  }

  def printNiceAnswer() = {
    println("Day 05")
    println(s"  Puzzle 01: There are answer1 nice names on the list.")
  }

  def main(args: Array[String]) {
    Source.fromInputStream(getClass.getResourceAsStream(file)).getLines.foreach {
      line => {
        printNiceAnswer()
      }
    }
  }

}
