object listmun
{
  def main(args: Array[String]): Unit = {
    var list1 = List(25,17,12)
    var list2 = List(44,2,6,77)
    var  con = list1 ::: list2
    println("Revers String : "+con.reverse)
    println("Odd Number is : ")
    for(i<-0 to con.length-1)
      {
        if((con(i)%2)!=0)
          println(con(i))
      }
    var list3 = list1 :: (list2 :: Nil)
    println("List of the list"+list3)
    var str:String = list1.mkString(" ")
    println("Convert list 1 to string : "+str)
    println("Print all the element of list expect the last one : "+con.init)

  }
}
