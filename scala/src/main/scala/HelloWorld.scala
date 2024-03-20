import scala.io.StdIn
object HelloWorld extends  App{
  val name = StdIn.readLine("Hi! Enter your name: ")
  println(s"Hello $name!")
}
