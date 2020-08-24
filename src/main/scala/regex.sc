

val rawStr = "35 hundred potatoes in 2020 and some more dummy data 5!@#$"

val mySeq = rawStr.split(" ")

mySeq(0).toInt
//mySeq(1).toInt
mySeq(0).forall(_.isDigit)
mySeq(0).forall(c=>c.isDigit)
mySeq(1).forall(_.isDigit)

// get me only numbers out of the sequence of strings
//val onlyNumbers = mySeq.filter(txt => true)
val onlyNumbers = mySeq.filter(item => item(0).isDigit)
val onlyNumbers = mySeq.filter(item => item.forall(c=>c.isDigit))
mySeq.filter(_.forall(_.isDigit))
"Valdis".forall(_.isUpper)
"VALDIS".forall(_.isUpper)
"VALDIS".exists(_.isUpper)

val regex = "(\\d+)"
mySeq.filter(item => item matches regex)

//val rx ="(d.+)"
val rx ="(d\\w+)"
mySeq.filter(item => item matches rx)
//var = scala.collection.mutable.Seq()

//this is how you would use it with looping and mutable collection
var resultsSeq = scala.collection.mutable.Seq[String]()
for(item <- mySeq)
  if (item(0) == 'd') {
    println(s"Found match $item")
    resultsSeq = resultsSeq :+ item //append to mutable sequence
  }
//add to my resultsSeq
resultsSeq
