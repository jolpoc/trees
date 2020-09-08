val myStrings = Seq("Valdis","032425","Maija","3432423HMMM")
val notNums = myStrings.filterNot(t=> t matches "(^[0-9]+.*)")
val digits = Range(0,9)
digits.exists(n=> myStrings(1).startsWith(n.toString))
val digitStr = Range(0,10).map(_.toString)
digitStr.exists(n=>myStrings(1).startsWith(n.toString))
val myNums2 = myStrings.filter(t=>digits.exists(n=>t.startsWith(n.toString)))
print(digits)
digits.exists(n=>n*n ==25)
digits.exists(n=>n*n ==22)
digits.exists(n=>n*n ==16)

//val squares = Range(1,101).filter(num => )
val text = "CAPITAL small BIG 999"
val arr = text.toArray
val capitals = arr.filter(_.isUpper)
//val capAgain = arr.filter(c=>c.toString matches "[A-Z")
val capText = text.filter(_.isUpper)
val isAllCaps = "ABBA".forall(_.isUpper)
"ABBAddd".forall(_.isUpper)
//forall is lai visos range gadījumos nosacījums izpildās
Range(0,10).forall(_ > -3)
Range(0,10).forall(_ > 2)
Range(0,10).exists(_ > 2)
Range(0,10).exists(_ > 12)

def myExists (mySeq:Seq[Int], myNeedle:Int) = {
  var result = false
  for (n <- mySeq) {
    if (myNeedle ==n) result = true
  }
  result
}

myExists(Range(0,10),4)
myExists(Range(0,10),14)
Range(0,10).exists(_==4)