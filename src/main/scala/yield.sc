val mySeq = for (i <- 1 to 8 by 2) yield i

val myStrSeq = for (i <- 1 to 8 by 2) yield  s"My string $i"

val food = "potatoes"
val big_food = for (c <- food) yield c.toUpper
val big_food_too = food.map(_.toUpper)
var bigText = ""
val craxy_seq = for {
  c <- food
  bigLetter = c.toUpper
  someText = s"TEXT: $bigLetter"
} yield someText