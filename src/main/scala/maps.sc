import scala.collection.{SortedMap, mutable}

val myMap = Map("name" -> "Valdis", "job" -> "teaching","loves" -> "teaching")
myMap("name")
val mySeq = Seq(("name","Valdis"),("job", "teaching"))
myMap ("loves")
//you must have unique keys in your map
val myGeneralMap = Map("name" -> "Valdis","speed" -> 100, "name"->"Saule")
myGeneralMap("speed")
myGeneralMap.values
myMap.values.foreach(println)
myMap.keys.foreach(println)
for ((key,value)<- myMap) {
  println(s"Key: $key,Value: $value")
}

var newMap =myMap + ("food" -> "potatoes")
newMap += ("hunger" -> "growing")
newMap
newMap -= "food"
newMap
newMap.size
newMap.toSeq(1)
newMap.toSeq(1).getClass
val myNewSeq = Seq("Valdis","Liga","Maija")
val convertedMap = myNewSeq.map(f = a => a -> a(0)).toMap
convertedMap
Seq(("name","valdis"),("food","potatoes")).toMap
newMap
newMap -= "drinks"
newMap

//a task
//given text "Chocolate and Cocoa Recipes and Home Made Candy Recipes by Hill and Parloa"
//create Sequence with all words
//create Map mapping word -> word length
val aText = "Chocolate and Cocoa Recipes and Home Made Candy Recipes by Hill and Parloa"
val aSeq = aText.split(" ").toSeq
val aMap = aSeq.map(word => word -> word.length).toMap
aMap.foreach(println)



val sortedMap = SortedMap("food"-> "rice","drink"-> "water","car"-> "VW")
sortedMap
sortedMap.toSeq(2)
sortedMap.toSeq(2)._2
sortedMap("food")




var myMemoryMap = mutable.LinkedHashMap("name" -> "Valdis")
myMemoryMap += ("buy" -> "milk")
myMemoryMap += ("eat" -> "chocolate")
myMemoryMap -= "buy"
myMemoryMap ++= Map("sell"-> "gnomes","pickup"-> "kids")
myMemoryMap ++= myMap
myMemoryMap

var mutMap: mutable.Map[String,String] = mutable.Map()
for ((k,v) <- myMemoryMap)
  mutMap +=(k.toUpperCase -> v)
mutMap

val freshMap = myMemoryMap.map({
  case (key, value) => (key.toUpperCase, s"$value :: ${value.length}")
})
freshMap

var topValue = ""
var topKey = ""
for ((k,v) <- mutMap) {
  if (v.length > topValue.length) {
    topValue = v
    topValue = k
  }
}
println(s"Winning key is $topKey with value $topValue")