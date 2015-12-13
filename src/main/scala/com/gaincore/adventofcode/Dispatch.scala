package com.gaincore.adventofcode

/**
  * Created by David Lukac on 13/12/15.
  *
  * Construct the object with list of delivery men in order they should go.
  */
class Dispatch(lc: List[DeliveryMan]) {

  private val deliveryMen = lc
  private val currentMan: Iterator[DeliveryMan] = deliveryMen.iterator

  def nextMan: DeliveryMan = {
    if (currentMan.hasNext) {
      currentMan.next()
    }
    else {
      currentMan.++(deliveryMen.iterator)
      nextMan
    }
  }

}
