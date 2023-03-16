fun singleNumber(nums: IntArray): Int {
    var result = 0
    
    for (num in nums) {
        result = result xor num
    }
    
    return result
}

fun main() {
    val nums = intArrayOf()
    val single = singleNumber(nums)
    println ( single) 
}
