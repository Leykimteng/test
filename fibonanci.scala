object fibonanci
{
  def main(args: Array[String]): Unit = {
    println("Enter The Number: ")
    var a=scala.io.StdIn.readInt()
    var b:Int=0 ; var c:Int= 1;var t:Int=0;
    for(i<-0 to a)
    {
      println(b)
      b=b+c
      t=b
      b=c
      c=t
    }
  }
}
