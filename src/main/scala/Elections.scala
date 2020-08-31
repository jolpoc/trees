object Elections extends App {
  val adam = new Person ("Adam","Sandler", 49)
  val tommy = new Person("Tom","Sawyer",12)
  println(adam.fixedFirstName)
  println(adam.lastName)
  println(adam.age)
  adam.prettyPrint()
  println(adam.getFullName())
  adam.lastName = "Bungler"
  adam.prettyPrint()
  //adam.tempVariable = 9000
  //println(adam.tempVariable)
  println(tommy.isEligible())

  tommy.growUp(5)
  println(tommy.isEligible())
  tommy.growUp(2)
  println(tommy.isEligible())
  tommy.prettyPrint()
  println(tommy.getStats())
  println(adam.getStats())
  val carol = new Person ("Carol", "Smith", 27)
 val dave = new Person("Dave","Smith", 12)
  var totalAge = 0
  val people = Seq(adam, tommy, carol, dave)
  for (human <- people) {
    println(human.age)
    totalAge += human.age
  }
  val avgAge = totalAge / people.size.toDouble
  println(s"Average age is $avgAge")
  val youngOnes = people.filter(human => human.age <40)
  println(youngOnes.size)
  println(people.map(_.age).sum / people.size.toDouble)
  val eligibleVoters = people.filter(human => human.age >=18)
  println(eligibleVoters.size)
  println(eligibleVoters)
  //val allVoters = people.filter(human => human.isVoter == true)
 // allVoters.foreach(_.prettyPrint())
  val allVoters = people.filter(_.isVoter)
  allVoters.foreach(_.prettyPrint())
  allVoters.foreach(human => println(human.getFullName()))

  val lastNamesSorted = people.sortBy(_.lastName.length)
  val longestLastName = lastNamesSorted.takeRight(1)
  lastNamesSorted.foreach(human => println(human.lastName))
  longestLastName.foreach(human => println(s"The longest last name is: ${human.lastName}."))

  println(s"The longest last name is: ${(people.map(human=> human.lastName.length).sorted.last)} chars long")
print(s"Longest is ${people.map(h => h.lastName).sortBy(_.length).last}")
}