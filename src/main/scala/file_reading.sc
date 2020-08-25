import java.io.FileNotFoundException

import scala.io.Source

val fileName = "c:/poems/rfrost.txt"

for (line <- Source.fromFile(fileName).getLines)
  println(line)


var myText = List [String]()
try {
  val filePointer = scala.io.Source.fromFile(fileName)
  //val myText = filePointer.getLines.toSeq
  filePointer.close()
} catch {
  case ex: FileNotFoundException =>
    println("file not found")
}
myText.foreach(println)
myText(0)
myText.sorted.reverse(0)
myText.sortBy(_.size).reverse(0)
println(res3.size,res4.size)
myText.sortBy(_.size).reverse.reverse(0)
myText.filter(_.size > 0).sortBy(_.size).reverse.reverse(0)


var longestLine = ""

val mostWords =myText.sortBy(_.split( " ").size).toSeq(0)
"And looked down".slice(0,3)
"An".slice(0,3)

//val myLines = Source.fromFile(fileName).getLines()
////val myText = myLines.toSeq
//myLines.foreach(println) // iterator is exhausted
//myLines.foreach(println)
//myText.foreach(println)
//myText.foreach(println)
//Source.fromFile(fileName).close()
// we should close the file when we are done
//return the longest line





//print(System.getProperty("user.dir"))
////System.setProperty("user.dir", "~/Scala_Test")
//print(System.getProperty("user.dir"))
//val newPath = "/src/main/scala/frost"
////for(line <- Source.fromFile(newPath).getLines))
//println(line)