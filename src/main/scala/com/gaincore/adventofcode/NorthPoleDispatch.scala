package com.gaincore.adventofcode

import scala.annotation.tailrec

/**
  * Created by David Lukac on 13/12/15.
  *
  * Construct the object with list of delivery men in order they should go.
  */
class NorthPoleDispatch(lc: List[DeliveryMan]) {

  private val deliveryMen: List[DeliveryMan] = lc
  private var it: Iterator[DeliveryMan] = deliveryMen.iterator
  var currentMan: DeliveryMan = deliveryMen.head

  @tailrec final def nextMan: DeliveryMan = {
    if (it.hasNext) {
      currentMan = it.next()
      currentMan
    }
    else {
      it = deliveryMen.iterator
      nextMan
    }
  }

}
