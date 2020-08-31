

object restoraunt extends App{
val cook = new Cook ()
  cook.prettyPrint()
cook.make_a_muffin()
  val pet = new Animal ("Tom")
  val jerry = new Mouse("Jerry")
  pet.prettyPrint()
  jerry.squeek()
jerry.prettyPrint()
  val doggie = new Dog("Fluffy","woof woof")
  doggie.bark
  doggie.make_noise()
  val mice = Range(1,10).map(n => new Mouse(s"Mice no. $n"))
  mice.foreach(_.squeek())
}
