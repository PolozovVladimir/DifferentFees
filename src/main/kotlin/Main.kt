import sun.swing.MenuItemLayoutHelper.max

fun commission (card: String, formerTransfers: Int, currentTransfer: Double): Double {
    var commission = 0.0
    val dailyLimit = 150000.00
    val monthlyLimit = 600000.00

    when (card) {
        "Mastercard" -> {
            if (formerTransfers < 75000) {
                commission = 0.0
            } else {
                commission = currentTransfer * 0.006 + 20
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
    if (formerTransfers > dailyLimit) {
        println("Превышен дневной лимит")
    }
    if (formerTransfers > monthlyLimit){
        println("Превышен месячный лимит")
    }

    return commission

    }
