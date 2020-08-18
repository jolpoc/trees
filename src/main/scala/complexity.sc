import scala.util.Random

val max =1000
var sum = BigInt(0)
for (i<-1 to max)
  for (j <- 1 to max)
    sum += (i+j)
println(sum)

val myList = List.range(1,15)
val myArr = Array.range(1,15)
val mySeq = Seq.range(1,15)
//println(myList)
myList.foreach(println)
myArr.foreach(println)
mySeq.foreach(println)

val myOdd =Seq.range(1,11+1,2)
myOdd.foreach(println)

// filter is one of the core functional programming concepts
val myFilteredNumbers = mySeq.filter(n => (n%2 ==1))
myFilteredNumbers.foreach(println)
val myData = Seq.range(10,50,3).filter(n => n%5 == 0)
val my5 = myData.filter(f => f % 5 == 0)
val my500 = my5.map(n => n *100)
my500.foreach(println)
val myGreetings = my500.map(n => s"Hello Mr./Mrs. $n")
myGreetings.foreach(println)
myGreetings.getClass

val evenNumbers = Seq.range(10,25,2)
val myCubes = evenNumbers.map(n => n * n * n)
myCubes.foreach(println)
myCubes.foreach(item => println(s"My number is $item"))
val myNumbers = Seq.range(10,25).filter(n=> n %2 ==0)
//Seq.range(10,25).filter(n=> n %2 ==0).map(n=> n*n*n).foreach(println)
for (((item, i), original) <- myCubes.zipWithIndex.zip(myNumbers))
println(s"Number no. ${i+1}: original number ${original} cubed => $item")
val myCollection = myCubes.zip(myNumbers)
myCollection.foreach(println)
myCollection(0).getClass
myCollection(1)._2
for (myTuple <- myCollection) {
  println(myTuple._1,myTuple._2)
val (myNum, myCube) = myTuple
println(s"So $myNum cubes is $myCube")
}
//this myTuple is not related
myCollection.foreach(myTuple => println(myTuple._1,myTuple._2))
//tuples are used for holding anythings, could be different types
//lists, sequences, arrays hold same data types
val myBigTuple = ("Valdis",45,"Scala",3, 3.14)
myBigTuple
myBigTuple.getClass

val mySquares = Seq.range(1,10).map(n => n*n).map(n => s"my square $n")
mySquares.foreach(println)

Math.random()
Math.random()
val myRandoms = Seq.range(1,101).filter(_=> Math.random() < 0.20)
myRandoms.length
Random.between(20,30)

val randomSixth = Seq.range(1,101).filter(_=> Random.between(1,7) == 6)
val everySixth = Seq.range(1,101).filter(n=> n % 6 == 0) // every sixth

randomSixth.length
everySixth.length
