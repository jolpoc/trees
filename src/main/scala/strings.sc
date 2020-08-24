val myName = "Valdis" //string is implicit
println(myName)
myName.length
myName(0)
myName(1)
5 > 2*2
res2 > res3
"V" > "a"
"V" > "A"
"A".getClass
'A'.getClass
'A'.toInt
'V'.toInt
'a'.toInt
'ā'.toInt
'č'.toInt
'?'.toInt
val c = 'ā'
println(c)
val first3 = myName.take(3)
println(first3)
val last3 = myName.drop(3)
last3
val myFood = "potatoes"
myFood.slice(3,7) //notice that index 7 is not included
myFood(7)
//first real chaining example
myFood.toUpperCase.take(6).slice(1,4)

//equality
4 == 2*2
2*2 == 4
val a = 4
a == 4
a == 20

myFood == "paste"
myFood == "potatoes"
val myOtherFood = "potatoes"
myFood == myOtherFood

//building a string from other strings
//string interpolation makes it easy to build strings from other strings

println(s"My names is $myName and I really like $myFood")

val myNumber = 77
val myPI = 3.14159

println(s"My names is $myName and I really like $myFood since $myNumber .Thank You!")
println("My names is $myName and I really like $myFood since $myNumber .Thank You!")

println(s"My pie is very tasty and is round $myPI")

myFood.foreach(println) //really concise way of doing something to each character in a string

myFood.toUpperCase.foreach(println)

val otherFood = "potata"

myFood intersect otherFood

myFood diff otherFood

myFood.distinct //all unique

res35+res36
//below makes it easier not to miss any whitespace
s"$res35 ***** $res36"

myFood.count(_ == 'o')

val myMagic = "abrakadabra"
myMagic.count(_ == 'a')

val replacedString = myMagic.replace("abra", "oxxo")

//first match
myMagic.indexOf('r')
myMagic.indexOf("r")

myMagic.indexOf("aka")
myMagic.foreach(println)
val filteredLetters = myMagic.filter(c => (c< 'g'))
myMagic.map(c=> c.toUpper)
myMagic.map(c=> if (c<'g') c.toUpper else c )
val myNewFood = "potatoes"
// filter only letters higher than f,
// after that letters less than t should be capitalized
myNewFood.filter(c => c > 'f').map(c => if (c < 't') c.toUpper else c)
myNewFood.sorted
myNewFood.toSeq.sorted.unwrap  // this is the recommended way now, go back to the strings
myNewFood.toSeq.sortWith(_>_).unwrap
myNewFood.toSeq.sortWith((a,b) => a > b).unwrap
myNewFood.toSet.toString()
myNewFood.toSet.toSeq
myNewFood.toSet.toSeq.mkString("----")
myNewFood.toSet.toSeq.sorted.mkString("")
val myNums = Array (1,2,10,20)
val myNumStr = myNums.mkString(",")
val mySum = myNums.sum
val result = s"Result of summing $myNumStr is $mySum"
val result = s"Result of summing ${myNums.mkString(",")} is ${myNums.sum}"

