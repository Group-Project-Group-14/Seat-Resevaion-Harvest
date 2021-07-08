

object Harwest {
  def main(args:Array[String]){
    val calander=Array.ofDim[Double](4,7)
    val day=Array("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    var i=0
    var j=0
    var date=0
    var week=0
    var datemin=0
    var weekmin=0
    var sum:Double=0
    
    for(i<- 0 to 3){
      for(j<- 0 to 6){
        calander(i)(j)=scala.io.StdIn.readDouble()
      }
    }
     
    i=0
    j=0
    for(i<- 0 to 3){
      for(j<- 0 to 6){
        sum= sum + calander(i)(j)
        print(calander(i)(j)+" ")
      }
      println()
    }
    
    //maximum
    i=0
    j=0
    
    var max=calander(0)(0)
    for(i<- 0 to 3){
      for(j<- 0 to 6){
        if(max<calander(i)(j)){
          max=calander(i)(j)
          week=i
          date=j
        }
      }
    }
    
    
    //minimum
    i=0
    j=0
    
    var min=calander(0)(0)
    for(i<- 0 to 3){
      for(j<- 0 to 6){
        if(min>calander(i)(j)){
          min=calander(i)(j)
          weekmin=i
          datemin=j
        }
      }
    }
    
    
    var median=Array[Double](0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
    i=0
    j=0
    var k=0
    for(i<- 0 to 3){
      for(j<- 0 to 6){
        median(k)=calander(i)(j)
        k=k+1
      }
      println()
    }
    
    //sorting
    i=0
    j=0
    for(i<-1 until median.length){
      var key=median(i)
      j=i
      while(j>0 && key < median(j-1)){
        median(j)=median(j-1)
        j=j-1
      }
      median(j)=key
    }
    
    /*i=0
    for(i<-0 to 27){
      print(median(i)+" ")
    }*/
    println("Maxmimum harvest is: "+max+" KG"+" week: "+(week+1)+" day: "+day(date))
    println("Minimum harvest is: "+min+" KG"+" week: "+(weekmin+1)+" day: "+day(datemin))
    println("Total Weight of harvest is: "+sum+" KG")
    println("Range is: "+(max-min)+" KG")
    println("Average Weight of harvest is: "+(sum/28)+" KG")
    println("Median is: "+median(15))
  }
}