import scala.collection.immutable.{ListMap, TreeMap}

val map = scala.collection.mutable.HashMap.empty[Int,String]
map += (1 -> "make a web site")
map += (3 -> "profit!")
map(1)
map += (33 -> "learn")
map += (63 -> "relax")
map.foreach(println)

val listMap = ListMap(map.toSeq.sortBy(_._1):_*)
val listMapVal = map.toSeq.sortBy(_._2)
listMapVal.toMap
//listMap(2) will not work because its a ListMap not List (with index)
listMap(3)
listMap.foreach(tup => println(s"${tup._1} ${tup._2}"))
var newListMap = ListMap(("a" -> "AA"))
newListMap += "b" -> "BBBB"
newListMap += "c" -> "CBBBB"
newListMap += "e" -> "ieeee"
newListMap += "d" -> "ieeeedddee"
newListMap
newListMap("d")

//so TreeMap gives you keys in guaranteed sorted order and keeps that way
//again if you do not need this sorting ahead of time, just use Map
var newTreeMap = TreeMap("anton" -> "chekhov", "fyodor" -> "dostoyevsky", "aleksey" -> "tolstoy", "charles" -> "dickens")
newTreeMap

//You can do everything with just Map and Seq (with a little bit of Set)

val names = Seq("Valdis","Liga","Maija", "Martins","Ruta")
// create a Map out of names with keys the individual names and values their length
// see if you can make TreeMap instead :)

val nmap = names.map(name => name -> name.length).toMap
nmap
val namesMap = names.map(name => name -> name.length).toMap
val namesTreeMap = TreeMap(nmap.toArray:_*)
nmap.toArray
val namesTreeMap2 = TreeMap(names.map(name => name -> name.length):_*)
val nArr=nmap.toArray
def add2(a:(String,Int), b:(String, Int)) :Int = {
  a._2+ b._2
}
println(nArr(0),nArr(1))
//println(add2(nArr.slice(0,2))
val newTMAP = TreeMap(nArr(0),nArr(1))
val newTMAP2 = TreeMap(nArr.slice(0,3):_*)
nmap.foreach(item => println(s"${item._2},${item._1}"))
nmap.count(_._2 >5)
nmap.count(t=> t._1.startsWith("M")&& t._2 >5)
nmap.filter(t=> t._1.startsWith("M")&& t._2 >5)
val iSeq = nmap.toIndexedSeq
iSeq(2)
val foodSeq = IndexedSeq.fill(10)("potatoes")
val nSeq = IndexedSeq.tabulate(5,10)((n,o)=>(n*n,o+o))

var mseq = scala.collection.mutable.Seq(10,20)
mseq
mseq.headOption
val result = mseq.headOption
result match {
  case  Some(i) => println(s"result is $i")
  case None => println("Not good no data!")
}