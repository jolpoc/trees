import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar

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
val rx = "(\\bd\\D+)"

mySeq.filter(_(0) == 'd')
mySeq.filter(_(0) == 'd')

val myTxt = "Turns out "

val now = Calendar.getInstance()
now.get(Calendar.DATE)
now.get(Calendar.YEAR)
now.get(Calendar.DATE)
now.get(Calendar.DAY_OF_MONTH)
now.get(Calendar.DAY_OF_WEEK)

val df = DateTimeFormatter.ofPattern("dd/MM/yyyy")
val today = "24/08/2020"
val dayOfWeek = LocalDate.parse(today,df).getDayOfWeek

def getDayOfWeek(n:Int) = {
  val myDays = Seq("SUNDAY","MONDAY","TUESDAY","WED","THURS","FRI","SAT")
  myDays(n-1) //TODO document why -1 because of dif libraries
}
val weekDay = getDayOfWeek(now.get(Calendar.DAY_OF_WEEK))
println(s"Today is $today which is $weekDay")