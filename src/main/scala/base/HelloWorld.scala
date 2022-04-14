import scala.io.StdIn

object HelloWorld {

  def main(args: Array[String]): Unit = {
    val name = StdIn.readLine("Enter name: ")
    println(s"$name huilo")
  }

}
