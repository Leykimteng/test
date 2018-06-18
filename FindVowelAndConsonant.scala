object fv
{
  def main(args: Array[String]): Unit = {
    println("Enter the String")
    var str:String = scala.io.StdIn.readLine()
    var v:String = ""
    var c:String = ""
    var n:String = ""
    var s:String = ""
    var nv: Int=0
    var nc:Int =0
    var nn:Int=0
    var ns:Int=0
    for(i<-0 to (str.length()-1))
      {
        if((str.charAt(i)== 'A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U')||(str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
          {
            v=v+str.charAt(i)
            nv=nv+1
          }
        else if((str.charAt(i)>64&&str.charAt(i)<91)||(str.charAt(i)>96&&str.charAt(i)<123))
          {
            c=c+str.charAt(i)
            nc=nc+1
          }
        else if(str.charAt(i)>47&&str.charAt(i)<58)
          {
            n=n+str.charAt(i)
            nn=nn+1
          }
        else
          {
            s=s+str.charAt(i)
            ns=ns+1
          }
      }
    println("The Number of Vowel is "+nv+" : "+v)
    println("The Number of Consonant is "+nc+" : "+c)
    println("The Number of Number is "+nn+" : "+n)
    println("The Number of Symbolic is "+ns+" : "+s)
  }
}
