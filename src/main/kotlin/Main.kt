import sun.swing.MenuItemLayoutHelper.max
fun main (){
println(commission(
))
}
fun commission (card: String = "Мир", formerTransfers: Int = 0, currentTransfer: Double = 1000.0): Double {
    var commission = 0.0
    val dailyLimit = 150000.00
    val monthlyLimit = 600000.00

    if (formerTransfers + currentTransfer  > dailyLimit ) return -1.0
    if (formerTransfers + currentTransfer > monthlyLimit) return -2.0

    when (card) {
        "Mastercard" -> {
            when{
                formerTransfers > 75000 -> commission = currentTransfer * 0.006 + 20
                formerTransfers + currentTransfer > 75000 -> commission = (formerTransfers + currentTransfer - 75000) * 0.006 + 20
                formerTransfers + currentTransfer <= 75000 -> commission = 0.0
            }


        }

        "Visa" -> {
            commission = currentTransfer * 0.0075
            if (commission < 35) {
                commission = 35.0
            }
        }

        "Мир" -> {
            commission = 0.0
        }

    }


    return commission

    }
