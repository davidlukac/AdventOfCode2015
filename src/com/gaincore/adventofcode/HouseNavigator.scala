package com.gaincore.adventofcode

import scala.collection.mutable

/**
  * Created by David Lukac on 13/12/15.
  */
class HouseNavigator {

  // Starting position [0, 0] at the grid.
  private val currentPosition = new XYPosition(0, 0)
  // Initial - empty - list of houses.
  private val houses = mutable.Map[XYPosition, Int]()

  // Initialising the list with one house Santa always visits.
  houses(new XYPosition(currentPosition)) = 1

  def navigate(c: Char): Unit = {
    c match {
      case '^' => currentPosition.goNorth
      case '>' => currentPosition.goEast
      case '<' => currentPosition.goWest
      case 'v' => currentPosition.goSouth
    }

    if (houses.get(currentPosition).isEmpty) {
      // Creating new house.
      houses(new XYPosition(currentPosition)) = 1
    }
    else {
      // Increment number of visits.
      // houses(currentPosition) = houses.get(currentPosition, 0) += 1
    }
  }

  def getSingleVisits = {
    this.houses.size
  }

}
