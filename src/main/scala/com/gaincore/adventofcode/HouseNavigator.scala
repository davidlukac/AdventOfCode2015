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
  private val santa2 = new DeliveryMan("Santa")
  private val roboSanta = new DeliveryMan("RoboSanta")
  private val housesWithRoboSanta = mutable.Map[XYPosition, Int]()
  private val dispatch = new NorthPoleDispatch(List(santa2, roboSanta))

  housesWithRoboSanta(new XYPosition(santa2.position)) = 2

  def navigate(c: Char): Unit = {
    c match {
      case '^' => {
        Santa.position.goNorth
        dispatch.nextMan.position.goNorth
      }
      case '>' => {
        Santa.position.goEast
        dispatch.nextMan.position.goEast
      }
      case '<' => {
        Santa.position.goWest
        dispatch.nextMan.position.goWest
      }
      case 'v' => {
        Santa.position.goSouth
        dispatch.nextMan.position.goSouth
      }
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
    if (housesWithRoboSanta.get(dispatch.currentMan.position).isEmpty) {
      // Creating new house.
      housesWithRoboSanta(new XYPosition(dispatch.currentMan.position)) = 1
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

  def getRoboAndSantaVisits = {
    this.housesWithRoboSanta.size
  }

}
