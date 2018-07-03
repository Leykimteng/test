object multi
{
  def main(args: Array[String]): Unit = {
    var a,b,mul = Array.ofDim[Int](3,3)
    var sum:Int=0
    println("Enter The Integer 1st Martrix: ")
    for(i<-0 to 2;j<-0 to 2)
      a(i)(j)= scala.io.StdIn.readInt()
    println("Enter the Integer for 2nd Martrix")
    for(i<-0 to 2;j<-0 to 2)
      b(i)(j)= scala.io.StdIn.readInt()
    for(i<-0 to 2;j<-0 to 2) {
        for (k<-0 to 2)
          sum=sum+(a(i)(k)*b(k)(j))
        mul(i)(j)=sum
        sum=0
    }
    println("Answer is : ")
    for(i<-0 to 2){
      for(j<-0 to 2)
          print(mul(i)(j))
        println("")
    }
  }
}
