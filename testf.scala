object fun
{
  def test() =
    {for(i<-1 to 10){println(i)}
    println("Print 10 num")}

  def main(args: Array[String]): Unit = {
    test()
  }
}
