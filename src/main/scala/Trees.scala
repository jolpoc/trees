object Trees extends App {
  var treeH = 3
if (!args.isEmpty) treeH = args(0).toInt
  println(s"ready to make myy tree $treeH high")
//  for (i <- 1 to treeH) {
//    println(" "*(treeH- i ))
//    println("*"*(i*2-1))
//  }
//val result = Range(1,treeH+1).map(n=>" "*(treeH-n)+ "*"*(n*2-1)))
//  result.foreach(println)
//  println(result.getClass)
Range(1,treeH+1).map(n=>" "*(treeH-n)+ "*"*(n*2-1)).foreach(println)
  Range(1,5).map(num=> num*10).foreach(println)
  val mySeq = Seq("Valdis","Liga","Maija","Voldemars","Sophia")
  //mySeq.map(txt => txt.length).foreach(println)
  //mySeq.map(txt => txt.toUpperCase).foreach(println)
  println("Printing only long names!")
//val longCapitalNames = mySeq.map(txt => txt.toUpperCase).filter(_.length > 5)
val longCapitalNames = mySeq.filter(txt => txt.length > 5).map(txt => txt.toUpperCase)
  longCapitalNames.foreach(println)
}