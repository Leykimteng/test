object tuple
{
  def main(args: Array[String]): Unit = {
    var x = ("hello",5,10.3,"Hers",3)
    var sum:Double=0
    var sumi:Int=0
    var sums:String=""
    var sumd:Double=0
    x.productIterator foreach  {
      case i:Int => sumi += i; sum= sumd+ sumi.toDouble
      case j:String => sums += j +" "
      case k:Double => sumd +=k; sum= sumd+ sumi.toDouble
    }
    println("Integer : "+sumi+"\nDouble: "+sumd+"\nString : "+sums+"\nSum all number : "+sum)
  }
}
