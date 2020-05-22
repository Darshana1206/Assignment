package Assignment

object Q3 {
 def main(args:Array[String])
 {
   var wholesaleCost:Double=totalCost(60)
   println(f"Wholesale Cost = $wholesaleCost%.2f" )
 }
 def coverCost(n:Int):Double={
   n*24.95*60D/100
 }
 def shipping(n:Int):Double={
   50*3 + (n-50)*0.75
 }
 def totalCost(n:Int):Double={
   coverCost(n) + shipping(n)
 }
}
