import scala.util.Success

object CookBook extends App {
  val srcName = "13177-8.txt"
  val dstName ="13177-8-results.txt"
def openSource(fName:String) Seq[String]=
  {
    // actually get real sequence of strings
    Seq("abra", "dabra") //just a placeholder
  }
  def processSeq(mySeq:Seq[String]):Seq[String]={
    Seq("RECIPE","ingredient")
  }
  def saveSeq(destName:String, mySeq:Seq[String]):Success.type = {
    println(s"Saving mySequence to file $destName")
    scala.util.Success
  }

  //the actual program runs here
  val mySeq = openSource(srcName)
  val filteredSeq = processSeq(mySeq)
  saveSeq(dstName,filteredSeq)
}
