object DiskAreaCalculator{
    def calArea(r : Double): Double ={
        math.Pi * r * r
    }

    def main(args: Array[String]): Unit = {
        val r = 5.0
        val area = calArea(r)
        println(s"Area of the disk with radius $r is $area")
    }
}


