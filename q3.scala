object VolumeCalculator{
    def calVolume(r:Double) : Double = {
        (4.0 / 3.0)* math.Pi * math.pow(r,3)
    }

    def main(args: Array[String]): Unit = {
        val r = 5.0
        val vol = calVolume(r)
        println(s"Volume of a sphere with radius $r is $vol")
    }
}