object heyy {
  def main(args: Array[String]): Unit = {
    println("Enter A Number to Display timetable: ");
    var a = scala.io.StdIn.readInt();
    if(a%15==0)
    {
      println("Foo Bar")
    }
    else if(a%5==0)
    {
      println("Bar")
    }
    else if(a%3==0)
    {
      println("Foo")
    }
    else
      {
        println("Error")
      }
  }
}
