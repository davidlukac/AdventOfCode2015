package com.gaincore.adventofcode

import java.math.BigInteger
import java.security.MessageDigest

import scala.annotation.tailrec

/**
  * Created by davidlukac on 15/12/15.
  */
class AdventCoinMiner {

  private val digester: MessageDigest = MessageDigest.getInstance("MD5")
  private var secret: String = ""
  private var hexStart: String = "00000"

  def mine(secret: String, hexStart: String): Int = {
    // Initial reset of the Digest object, in case the mining was invoked more than once on this instance.
    digester.reset()
    this.secret = secret
    this.hexStart = hexStart
    // Starting we zero and we'll work up to the result.
    dig(0)
  }

  @tailrec private def dig(number: Int): Int = {
    val inputString: String = this.secret + number
    val hashBytes: Array[Byte] = digester.digest(inputString.getBytes("UTF-8"))
    val hashBigInt: BigInteger = new BigInteger(1, hashBytes)
    // Make sure the HEX string has leading zeroes.
    val hexStringHash: String = f"$hashBigInt%032x"

//    if ((number % 1) == 0) println(s"N is: $number, input string is: $inputString, hash is: $hexStringHash")

    if (hashIsCorrect(hexStringHash)) {
      number
    }
    else {
      digester.reset()
      dig(number + 1)
    }
  }

  def hashIsCorrect(hexHash: String): Boolean = hexHash.startsWith(hexStart)

}
