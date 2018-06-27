object listta
{
  def main(args: Array[String]): Unit = {
    var a:List[Int] = List(12,23,123,123,123)
    var b:List[Int] = List(12,23,123,123,123)
    var c:List[Int] = List(12,23,123,123,123)
    var d:List[Int] = List(12,23,123,123,123)
    var e:List[Int] = List(12,23,123,123,123)
    var f = List(a,b,c,d,e)
    println("List inside list : "+f)
    println("List only one : "+f.flatten)
  }
}
