class Recipe (name: String, ingredients:Seq[String],instructions: Seq[String], cookTime:Int) extends Cooking {
//val macCheese = cook("cheese","shred")

  override def cook(ingredients: Seq[(String, String)], instructions: Seq[String]): String = {

    "Big mess"
  }
}
