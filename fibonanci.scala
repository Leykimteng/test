object fibonanci
{
  def fib(a:Int) : Int = {
    if(a == 0)
        return 0
    else if( a == 1)
      return 1
    else
      return fib(a-1)+fib(a-2)
  }
  def main(args: Array[String]): Unit = {
    println("Enter The Number: ")
    var a=scala.io.StdIn.readInt()
    for(i<-0 to a)
    {
      println(fib(a))
    }
  }
}
