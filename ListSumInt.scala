object tuple
{
  def main(args: Array[String]): Unit = {
    var x = List("hello",5,10.3,"Hers",3)
    var sum:Float=0
    for(i<-0 to x.length-1)
        if((x(i).## < 65))
           sum=x(i).toString.toFloat +sum
    println(sum)
  }
}
