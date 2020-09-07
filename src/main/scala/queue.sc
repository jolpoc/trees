import scala.collection.mutable.Queue
var ints = Queue[Int]()
var fruits = Queue[String]()
var q = Queue[Person]()

fruits += "apple"
fruits += "lemon"
fruits += "pear"
println(fruits)
fruits ++= Seq("banana","apricot")
fruits
fruits.enqueue("forbidden fruit")
println(fruits.dequeue())
fruits
//fruits.zipWithIndex.filter(t => t._2 <3).map(t=> t._1)
fruits.slice(0,3)
fruits
val first3 = for {
i <-0 to 2
item = fruits.dequeue()} yield item
first3
fruits
q.enqueue(new Person ("Valdis","S", 150))
q.enqueue(new Person ("Liga","S", 150))
q.enqueue(new Person ("Youngster","S", 15))
q.enqueue(new Person ("Maija","S", 150))
q.enqueue(new Person ("Ruta","S", 15))
q.count(_.age >100)
val firstPerson = q.dequeue()
firstPerson.prettyPrint()
val teenagers = q.dequeueAll(_.age <19)
teenagers.foreach(_.prettyPrint())
q.foreach(_.prettyPrint())
//another way of excluding elements from the right side:
//fruits.takeWhileInPlace(!_.equals("apricot"))