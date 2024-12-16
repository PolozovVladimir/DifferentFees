import sun.swing.MenuItemLayoutHelper.max
fun main (){
    commission("Мир", 0, 1000.0)
    println()
}
fun commission (card: String, formerTransfers: Int, currentTransfer: Double): Double {
    var commission = 0.0
    val dailyLimit = 150000.00
    val monthlyLimit = 600000.00

    if (formerTransfers > dailyLimit) {
        println("Превышен дневной лимит")
    }
    if (formerTransfers > monthlyLimit){
        println("Превышен месячный лимит")
    }

    when (card) {
        "Mastercard" -> {
            if (formerTransfers + currentTransfer > 75000) {
                commission = currentTransfer * 0.006 + 20
            } else {
                commission = 0.0
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
