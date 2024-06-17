object TemperatureConverter{
    def converter(cel : Double) : Double = {
        cel * 1.80 +32.00
    }

    def main(args : Array[String]): Unit = {
        val cel = 35.0
        val far = converter(cel)
        println(s"Farenheit equivalent of $cel C is $far F")
    }
}