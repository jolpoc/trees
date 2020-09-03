object Kitchen extends App {
println("Starting cooking!")
  val salad = new Recipe("Summer Salad", Seq("tomatoes", "sour cream","onions","paprika"), Seq("cut into pieces", "mix","chop"), 5)
  salad.printIngredients()
  salad.tupIngredients.foreach(println)
// jobs = salad.cook(salad.tupIngredients,Seq("cut into pieces","mix","chop"))

val jobs= salad.superCook()
  println(jobs)
  val soup = new Recipe("borsch", Seq("beets","onions","beefstock","carrot"), Seq("cut","chop","split","boil","extra rinse"),90)
  println(soup.superCook())
}
