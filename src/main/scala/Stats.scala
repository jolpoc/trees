trait Stats {
def myAvg(numbers:Seq[Int]): Double = {
  println(numbers.sum)
  println(numbers.length)

  numbers.sum.toDouble / numbers.length
}

}
