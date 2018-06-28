import scala.util.matching.Regex

object tt
{
  def main(args: Array[String]): Unit = {
    var  pattern = "\\A".r
  var a = List[String]("Alex","Aloha","Hola","Bob")
   for (i<-0 to a.length-1)
    {
      if(a(i).startsWith("A"))
        println(a(i))
    }
    println("Enter char")
    var b= scala.io.StdIn.readLine()
    if(b.length()==4)
      println("Yes")
    else println("NO")
  }
}
