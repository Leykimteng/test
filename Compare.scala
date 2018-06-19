object compare
{
  def main(args: Array[String]): Unit = {
    println("Enter 3 Number to compare: ")
    var a:Int=scala.io.StdIn.readInt()
    var b:Int=scala.io.StdIn.readInt()
    var c:Int=scala.io.StdIn.readInt()
    if(a>b)
      {
        if(a>c)
          {
            if(b>c)
            println(a+" "+b+" "+c)
            else if(b==c)
              println(a+" "+b+" "+c+" Second & Third is equal")
            else
              println(a+" "+c+" "+b)
          }
        else if (a==c)
          println(a+" "+c+" "+b+ " First & Third is equal")
        else
          println(c+" "+a+" "+b)
      }
    else if(a==b)
      {
        if(a>c)
          println(a+" "+b+" "+c)
        else if(a==c)
          println(a+" "+b+" "+c+" All Equal")
      }
    else
      {
        if(a>c)
          println(b+" "+a+" "+c)
        else if(a==c)
          println(b+" "+a+" "+c+ " First & Third is equal")
        else
          {
            if(b>c)
              println(b+" "+c+" "+a)
            else if(b==c)
              println(b+" "+c+" "+a+" Second & Third is Equal")
            else
              println(c+" "+b+" "+a)
          }
      }
  }
}
