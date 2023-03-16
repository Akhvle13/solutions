fun minCoins(money: Int): Int {
    var remainingMoney = money
    var coins = 0
    val denominations = intArrayOf(50, 20, 10, 5, 1)
    
    for (denomination in denominations) {
        while (remainingMoney >= denomination) {
            remainingMoney -= denomination
            coins++
        }
    }
    
    return coins
}

fun main() {
    val money = 73
    val coins = minCoins(money)
    println(money coins) 
}
