object Factorial
{
  def main(args: Array[String]): Unit = {
    var as= Range(1,101 )
    for(i<- as)
        if(i%15==0)
          println("Foo Bar")
        else if (i%5==0)
          println("bar")
        else if(i%3==0)
          println("Foo")
        else
          println(i)
  }
}
