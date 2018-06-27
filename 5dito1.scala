object d
{
  def main(args: Array[String]): Unit = {
    var a = Array.ofDim[Int](5,5,5,5,5)

    var n:Int = 0
    for (i<-0 to 4;j<-0 to 4; k<-0 to 4; l<-0 to 4; m<-0 to 4)
      {
        a(i)(j)(k)(l)(m)= n
        n=n+1
      }
    var b = Array.ofDim[Int](n)
    n=0
    for (i<-0 to 4;j<-0 to 4; k<-0 to 4; l<-0 to 4; m<-0 to 4)
      {
          b(n)=a(i)(j)(k)(l)(m)
        n=n+1
      }
    for (n<-0 to b.length-1)
      {
        println(b(n))
      }
  }
}
