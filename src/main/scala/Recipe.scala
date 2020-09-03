

class Recipe (name: String, ingredients:Seq[String],instructions: Seq[String], cookTime:Int) extends Cooking {
//val macCheese = cook("cheese","shred")
def printIngredients() =
for (item <- ingredients){
  println(item)
}
def getTupSeq(): Seq[(String, String)] = {
  var mySeq = ingredients.slice(0,ingredients.size -1) zip ingredients.slice(1,ingredients.size)

  mySeq
}
def superCook():String = {
  val tasks = cook(tupIngredients,instructions)
  s"Recipe for:\n$name\n\n$tasks\n\nTakes $cookTime minutes to make."
  // we use pur internal instructions
}
  override def cook(tupIngredients: Seq[(String, String)], instructions: Seq[String]): String = {
val todos = tupIngredients zip instructions
   // todos.foreach(todoss => println(s"Take ${todoss._1._1} then ${todoss._2} with ${todoss._1._2}"))
    val textInstructions = todos.map(todo => s"Take ${todo._1._1} then ${todo._2} with ${todo._1._2}")
   // "Big mess"
    textInstructions.mkString("\n")
  }
  val tupIngredients = getTupSeq()
}
