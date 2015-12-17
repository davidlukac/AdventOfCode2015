package com.gaincore.adventofcode.tests

import com.gaincore.adventofcode.NaughtyOrNiceStringer
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by David Lukac on 16/12/15.
  */
class NaughtyOrNiceStringerSpec extends FlatSpec with Matchers {

  "The Stringer" should "evaluate example strings as nice" in {
    val stringer: NaughtyOrNiceStringer = new NaughtyOrNiceStringer

    stringer.isNice("ugknbfddgicrmopn") should be (true)
    stringer.isNice("aaa") should be (true)
  }

  "The Stringer" should "evaluate example strings as naughty" in {
    val stringer: NaughtyOrNiceStringer = new NaughtyOrNiceStringer

    stringer.isNice("jchzalrnumimnmhp") should be (false)
    stringer.isNice("haegwjzuvuyypxyu") should be (false)
    stringer.isNice("dvszwmarrgswjxmb") should be (false)
  }

}
