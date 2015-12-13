package com.gaincore.adventofcode

import scala.collection.mutable

/**
  * Created by David Lukac on 13/12/15.
  */
class HouseNavigator {

  // Initialising Santa.
  private val Santa = new DeliveryMan

  // Initial - empty - list of houses.
  private val houses = mutable.Map[XYPosition, Int]()
  // Initialising the list with one house Santa always visits.
  houses(new XYPosition(Santa.position)) = 1

  // Implementation support for RoboSanta.
  private val Santa2 = new DeliveryMan
  private val RoboSanta = new DeliveryMan
  private val housesWithRoboSanta = mutable.Map[XYPosition, Int]()

  housesWithRoboSanta(new XYPosition(Santa2.position)) = 2

  def navigate(c: Char): Unit = {
    c match {
      case '^' => {
        Santa.position.goNorth
      }
      case '>' => Santa.position.goEast
      case '<' => Santa.position.goWest
      case 'v' => Santa.position.goSouth
    }

    // Placing gifts to house - Santa is alone.
    if (houses.get(Santa.position).isEmpty) {
      // Creating new house.
      houses(new XYPosition(Santa.position)) = 1
    }
    else {
      // Increment number of visits.
      // @todo Implement this fork.
      // houses(currentPosition) = houses.get(currentPosition, 0) += 1
    }

    // Placing gifts to house - RoboSanta is helping Santa.
    if (houses.get(Santa.position).isEmpty) {
      // Creating new house.
//      houses(new XYPosition(Santa.position)) = 1
    }
    else {
      // Increment number of visits.
      // @todo Implement this fork.
      // houses(currentPosition) = houses.get(currentPosition, 0) += 1
    }
  }

  def getSingleVisits = {
    this.houses.size
  }

}
