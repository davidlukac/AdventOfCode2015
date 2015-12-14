package com.gaincore.adventofcode.tests

import com.gaincore.adventofcode.{DeliveryMan, NorthPoleDispatch}
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by David Lukac on 13/12/15.
  */
class DispatchSpec extends FlatSpec with Matchers {

  val test = "Some test is going to be here"

  "A Dispatch" should "return first DeliveryMan from the list after the last one" in {
    val deliveryMen: List[DeliveryMan] = List(
      new DeliveryMan("Santa"),
      new DeliveryMan("Robotic-Santa"),
      new DeliveryMan("Santa's Little Helper")
    )
    val dispatch = new NorthPoleDispatch(deliveryMen)

    // Iterating over the Dispatch twice + 1 to check the functionality.
    for (i <- Range(0, 6)) {
      dispatch.nextMan.name should be (deliveryMen(i % deliveryMen.size).name)
    }
  }

  "A Dispatch" should "always return the same DeliveryMan as the current one" in {
    val deliveryMen: List[DeliveryMan] = List(
      new DeliveryMan("Santa"),
      new DeliveryMan("Robotic-Santa"),
      new DeliveryMan("Santa's Little Helper")
    )
    val dispatch = new NorthPoleDispatch(deliveryMen)

    // Iterating over the Dispatch and checking persistence of current man,
    for (i <- Range(0, 6)) {
      dispatch.nextMan.name should be (deliveryMen(i % deliveryMen.size).name)
      dispatch.currentMan.name should be (deliveryMen(i % deliveryMen.size).name)
    }
  }

}
