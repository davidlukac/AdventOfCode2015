package com.gaincore.adventofcode

import scala.io.Source

/**
  * Created by davidlukac on 13/12/15.
  */
object Day03Challenge01 {

  def main(args: Array[String]) {
    val file = "assets/input_03-01.txt"

    val nav = new HouseNavigator

    Source.fromFile(file).foreach {
      c => nav.navigate(c)
    }

    println(nav.getSingleVisits.toString + " houses got at least one present")
  }

}
