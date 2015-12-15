package com.gaincore.adventofcode

import scala.io.Source

/**
  * Created by David Lukac on 15/12/15.
  */
object Day04Challenge01 {

  def getRawPuzzle01(secret: String): String = {
    getRawPuzzle01(secret, "00000")
  }

  def getRawPuzzle01(secret: String, hexStart: String): String = {
    val miner = new AdventCoinMiner
    miner.mine(secret, hexStart).toString
  }

  def printNiceAnswer(input: String) = {
    val answer1 = getRawPuzzle01(input)
    val answer2 = getRawPuzzle01(input, "000000")
    println("Day 04")
    println(s"  Puzzle 01: The 2nd input part for `$input` is: `$answer1`.")
    println(s"  Puzzle 02: The 2nd input part for `$input` is: `$answer2`.")
  }

  def main(args: Array[String]) {
    val file = "/input_04-01.txt"

    Source.fromInputStream(getClass.getResourceAsStream(file)).getLines.foreach {
      line => printNiceAnswer(line)
    }
  }

}
