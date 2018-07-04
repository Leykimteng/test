object sum
{
  def main(args: Array[String]): Unit = {
    println("Enter the Number of array")
    var i= scala.io.StdIn.readInt()
    var sum,max:Int=0
    var arr1,arr2= new Array[Int](i)
    var arr = new Array[Int](2*i)
    for(j<-0 to i-1) {
      println("Enter the number for "+(j+1)+" Element")
      arr1(j) = scala.io.StdIn.readInt()
      sum = sum + arr(j)
    }
    for(j<-0 to i-2)
        if(arr1(j)<arr1(j+1))
          max=arr1(j+1)
      println("Sum of "+i+" numer is : "+sum)
      println("Max Number is : "+max)
    max=0
    println("Enter second array of "+i+" number : ")
    for(j<-0 to i-1) {
      println("Enter the number for " + (j + 1) + " Element")
      arr2(j) = scala.io.StdIn.readInt()
    }
    for(j<-0 to 2*(i-1))
      {
        if(j<i)
          arr(j)=arr1(j)
        else {
          arr(j) = arr2(max)
          max += 1
        }
      }

    for(j<-0 to 2*(i-1))
      print(arr(j)+ " ")
  }
}
