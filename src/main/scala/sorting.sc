import scala.util.Random

val myData = Seq(1,2,5,6,7,7,2,1,6,7,10)
//val myRandoms = Range(1,20).map(n=>(Math.random()*20).toInt)
val myRandoms =Range(1,20).map(n=> Random.between(1,20+1))
myRandoms
myRandoms.sorted
myRandoms.sorted.reverse

val myTexts = Seq("Valdis","Liga","Maija","Abracadabra","Voldemars")
myTexts.sorted
myTexts.sortWith(_.length > _.length)
myTexts.sortWith(_.length < _.length)
// the above is a shorthand for the below function
myTexts.sortWith((arg1, arg2) => arg1.length < arg2.length)
myTexts.sortBy(_.length)
myTexts.sortBy(item => item.length)
// tiny exercise sort the text by 2n letter only, tiebreak later
myTexts.sortBy(t => t(1))
myTexts.sortBy(t => t(1) + t(2))
myTexts.sortBy(t => (t(1),t(2)))
myTexts.sortWith((a,b) => a(1) < b(1))
myTexts.sortWith((a,b) => a(1) < b(1) && a(2) < b(2))
Seq("_BC","_BB","_BB__","_BB____","_BD","_AD").sortBy(t=> (t(1),t(2),t.length))

//rarely used you can actually pick the algorithm
val fruits = Array("cherry", "apple","banana")
fruits.sorted
val sortedFruits = fruits.sorted.reverse
scala.util.Sorting.quickSort(fruits)
fruits
scala.util.Sorting.stableSort(myTexts)