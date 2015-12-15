package com.gaincore.adventofcode.tests

import com.gaincore.adventofcode.Day04Challenge01
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by davidlukac on 15/12/15.
  */
class Day04Challenge01Spec extends FlatSpec with Matchers {

  "The Miner" should "return 609043 for secret abcdef" in {
    val miner = Day04Challenge01

    miner.getRawPuzzle01("abcdef") should be ("609043")
  }

  "The Miner" should "return 1048970 for secret pqrstuv" in {
    val miner = Day04Challenge01

    miner.getRawPuzzle01("pqrstuv") should be ("1048970")
  }

}
