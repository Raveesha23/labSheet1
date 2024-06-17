object BookCostCalculator{
    def totalWholesaleCost(num : Int): Double ={
        val coverPrice = 24.95
        val discount = 0.40
        val discountedPrice= coverPrice * (1-discount)

        val shippingFIrst50 = 3.00
        val shippingAdditional = 0.75

        val totalDiscountedPrice = discountedPrice * num

        val totalShippingCost = if(num <= 50){
            shippingFIrst50
        } else{
            shippingFIrst50 + (num - 50) * shippingAdditional
        }

        totalDiscountedPrice +totalShippingCost
    }

    def main(args:Array[String]): Unit = {
        val num = 60
        val totalCost = totalWholesaleCost(num)
        println(s"Total wholesale cost for $num copies is Rs. $totalCost")
    }
}