fun countVariants(stairsCount: Int): Int {
    if (stairsCount <= 0) {
        return 0
    } else if (stairsCount == 1) {
        return 1
    }
    
    var prev = 1
    var current = 1
    
    for (i in 2..stairsCount) {
        val next = prev + current
        prev = current
        current = next
    }
    
    return current
}

fun main() {
    val stairsCount = n
    val variants = countVariants(stairsCount)
    println(stairsCount stairs: variants) 
}
