object sum
{
  def main(args: Array[String]): Unit = {
    println("Enter the Number of array")
    var i= scala.io.StdIn.readInt()
    var sum:Int=0
    var arr= new Array[Int](5)
    for(j<-0 to i-1) {
      println("Enter the number for "+(j+1)+" Element")
      arr(j) = scala.io.StdIn.readInt()
      sum = sum + arr(j)
    }
      print("Sum of "+i+" numer is : "+sum)
  }
}
