object recursion
{
  def fac(i: Int): Int = {
    if(i==0)
      return 1
    else
      return i*fac(i-1);
  }

  def main(args: Array[String]): Unit = {
    println("Enter the Number")
    var a= scala.io.StdIn.readInt();
    println("Factorial of "+a+" is: "+fac(a))
  }
}
