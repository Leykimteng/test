object func
{
  def square(i:Int) : Int ={
    return i*i
  }
  def sos(i:Int, j:Int): Int = {
    return square(i)+square(j)
  }
  def guess(i:Int): String = {
    println("Enter the Number to guess : ")
    var k = scala.io.StdIn.readInt()
    var a= square(i)-k
    if(k==square(i)||k==(square(i)-1)||k==(square(i)+1))
      return "Correct"
    else
      println("Your need "+a+" more.")
      return guess(i)
  }
  def main(args: Array[String]): Unit = {
    println("Enter the Number")
    var i= scala.io.StdIn.readInt()
    println("The square of "+i+" number is : "+square(i))
    println("Enter Another Number")
    var j= scala.io.StdIn.readInt()
    println("The Sum of"+i+" and "+j+" squares is : "+sos(i,j))
    println("Enter the X : ")
    var k = scala.io.StdIn.readInt()
      println(guess(k))
  }
}
