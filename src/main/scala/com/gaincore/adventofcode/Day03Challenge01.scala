package com.gaincore.adventofcode

import scala.io.Source

/**
  * Created by David Lukac on 13/12/15.
  */
object Day03Challenge01 {

  def main(args: Array[String]) {
    val file = "/input_03-01.txt"

    val nav = new HouseNavigator

    Source.fromInputStream(getClass.getResourceAsStream(file)).foreach {
      c => nav.navigate(c)
    }

    println("Day 03")
    println("  Puzzle 01: When Santa was alone, " + nav.getSingleVisits.toString + " houses got at least one present.")
    println("  Puzzle 02: With RoboSanta " + nav.getRoboAndSantaVisits.toString + " houses got at least one present.")
  }

}
