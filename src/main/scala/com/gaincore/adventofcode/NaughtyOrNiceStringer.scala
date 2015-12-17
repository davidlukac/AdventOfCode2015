package com.gaincore.adventofcode

import scala.annotation.tailrec
import scala.collection.mutable

/**
  * Created by David Lukac on 16/12/15.
  */
class NaughtyOrNiceStringer {

  private val registry = mutable.Map[String, Boolean]()

  private var vowelCounter = 0
  private var pairCounter = 0

  def isNice(s: String): Boolean = {
    // Correct counter initialisation.
    vowelCounter = 0
    pairCounter = 0
    val naughtyOrNice: Boolean = isSeqNice(s)
    registry(s) = naughtyOrNice
    naughtyOrNice
  }

  @tailrec private def isSeqNice(seq: String): Boolean = {
    if (seq.nonEmpty) {
      val cut = seq.take(2)
      val h = cut.head
      val t = cut.last

      if (cut.length > 1) {
        // Evaluate evil pair.
        if (isEvilPair(h, t)) return false
        // Evaluate same letter pairs.
        if (h == t) pairCounter += 1
      }

      // Evaluate first letter of the pair
      if (isVowel(h)) vowelCounter += 1

      isSeqNice(seq.slice(1, seq.length))
    }
    else {
      // We can evaluate the whole thing here.
      if ((vowelCounter >= 3) && (pairCounter >= 1)) true else false
    }
  }

  def isVowel(c: Char): Boolean = c match {
    case 'a' | 'e' | 'i' | 'o' | 'u' => true
    case _ => false
  }

  def isEvilPair(c1: Char, c2: Char): Boolean = (c1, c2) match {
    case ('a', 'b') | ('c', 'd') | ('p', 'q') | ('x', 'y') => true
    case _ => false
  }

}
