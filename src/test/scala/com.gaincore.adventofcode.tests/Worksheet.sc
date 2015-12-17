import com.gaincore.adventofcode.NaughtyOrNiceStringer

val stringer: NaughtyOrNiceStringer = new NaughtyOrNiceStringer

stringer.isVowel('a')

var vowelCounter = 0
var pairCounter = 0

// Let's assume input is always string of length at least 2 characters.

def isEvilPair(c1: Char, c2: Char): Boolean = (c1, c2) match {
  case ('a', 'b') | ('c', 'd') | ('p', 'q') | ('x', 'y') => true
  case _ => false
}

private def isSeqNice(seq: String): Boolean = {
  if (seq.nonEmpty) {
    val cut = seq.take(2)
    val h = cut.head
    val t = cut.last

    if (cut.length > 1) {
      // Evaluate evil pair.
      if (isEvilPair(h, t)) return false
      // Evaluate same letters.
      if (h == t) pairCounter += 1
    }

    // Evaluate first letter of the pair
    if (stringer.isVowel(h)) vowelCounter += 1


    isSeqNice(seq.slice(1, seq.length))
  }
  else {
    // We can evaluate the whole thing here.
    println(s"There were $vowelCounter vowels and $pairCounter pairs")
    if ((vowelCounter >= 3) && (pairCounter >= 1)) {
      true
    }
    else {
      false
    }
  }
}


val input = "dvszwmarrgswjxmb"
//val input = "ao"
isSeqNice(input)