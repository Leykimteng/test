object sum
{
  def main(args: Array[String]): Unit = {
    var a,b,sum = Array.ofDim[Int](2,2)
    println("Enter The Integer 1st Martrix: ")
    for(i<-0 to 1;j<-0 to 1)
      a(i)(j)= scala.io.StdIn.readInt()
    println("Enter the Integer for 2nd Martrix")
    for(i<-0 to 1;j<-0 to 1)
      b(i)(j)= scala.io.StdIn.readInt()
    for(i<-0 to 1;j<-0 to 1)
      sum(i)(j)=a(i)(j)+b(i)(j)
    println("Answer is : ")
    for(i<-0 to 1) {
      for(j<-0 to 1)
        print(sum(i)(j)+ " ")
      println("")
    }
  }
}
