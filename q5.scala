object RunTimeCalculator{

    def easyPace(d : Double) : Double = {
        8 * d
    }

    def tempo(d : Double) : Double = {
        7 * d
    }

    def main(args: Array[String]): Unit = {
        val totalRunTime = easyPace(2) + tempo(3) + easyPace(2)
        println(s"Total run time is : $totalRunTime")
    }
}