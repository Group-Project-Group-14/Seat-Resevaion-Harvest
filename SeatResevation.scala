

object SeatResevation {
  def main(args:Array[String]){
    
    var input=0
    var count=0
    var i=0
    var j=0
    var signal=0
    var row=0
    var column=0
    var seatCount=0
    val seats=Array.ofDim[String](5,3)
    val country=Array("SLK","IND","PAK","NZL","CHI")
    for(i<-0 to 4){
      for(j<- 0 to 2){
        seats(i)(j)="UNA" //UNA means unallocated
      }
    }
    
    while(count<4){
      println("The plane has been stopped at "+ country(count)+".Our next stop is "+country(count+1))
      for(i<-0 to 4){
        for(j<- 0 to 2){
          if(seats(i)(j)==country(count)){
            seats(i)(j)="UNA"
          }
        }
      }
      count=count+1
      signal=0  
      
      while(signal != -1){
        println("This is the current resevation.")
        println("   0   1   2  ")
        for(i<-0 to 4){
          print(i+" ")
          for(j<- 0 to 2){
            print(seats(i)(j)+" ")
          }
          println()
        }
      print("How many seats do you want to reserve:" )
      seatCount=scala.io.StdIn.readInt()
      for(k<-0 to seatCount-1){
        println("Enter the row number and the column number of the seat you want to reserve.")
        print("Row-> ")
        row=scala.io.StdIn.readInt()
        print("Column-> ")
        column=scala.io.StdIn.readInt()
        if(seats(row)(column)!="UNA"){
          println("Sorry! This seat is already Reserved")
        }else{
          print("Enter the destination->")
          seats(row)(column)=scala.io.StdIn.readLine()
        }
      }
      
      print("If you want to continue: enter '1'. Else, enter -1: ")
      signal=scala.io.StdIn.readInt()
      }
    }
    println("plane has arrived to china")
    
  }
  
}