package com.gaincore.adventofcode

import scala.util.Sorting

/**
  * Created by David Lukac on 12/12/15.
  */
class WrapperCalculator {

  private var paper = 0
  private var ribbon = 0

  /**
    * Calculates sqr. feet of paper needed for the wrapping.
    *
    * @param d
    *          Array of dimensions parsed from the input.
    */
  def wrap(d: Array[Int]) = {
    Sorting.quickSort(d)
    this.paper += ((3 * d(0) * d(1)) + (2 * d(0) * d(2)) + (2 * d(1) * d(2)))
    this.ribbon += (2 * d(0)) + (2 * d(1)) + (d(0) * d(1) * d(2))
  }

  def getTotalPaper = {
    this.paper
  }

  def getTotalRibbon = {
    this.ribbon
  }

}
