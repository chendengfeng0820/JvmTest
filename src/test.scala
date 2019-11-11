
object test {
  println(List(1,2,3,4,5)map(_ + 1))
  val data=List("scala","hadoop","spark")
  println(data map (_.length))
  println(data.map(_.toList))
   test
  def main(args: Array[String]): Unit
  =
  {
    val lines=List("a,b,c","d,e,f")
    var res=lines.flatMap(x=>x.split(",").toList)
    println(res)
  }
}
