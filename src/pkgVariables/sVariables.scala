package pkgVariables

object sVariables {
  def main(args: Array[String]): Unit = {
    //print("Hello World")
    val str = Seq("Hello", "World")
      .map(_.toLowerCase)
      .mkString("[",",","]")
    println(str)

    var seq: Seq[String] = Seq("My","name","is","Vijay", "K", "Patnaik")
    seq = Seq("1","2","3")

    print(seq)

    val array: Array[String] = Array("My","name","is","Vijay", "K", "Patnaik")

    var sVar = 6
    if (sVar < 5){println("Papa") } else { println("Mummy")}



  }
}
