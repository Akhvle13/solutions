fun addBinary(a: String, b: String): String {
    val num1 = a.toBigInteger(2)
    val num2 = b.toBigInteger(2)
    val sum = num1 + num2
    return sum.toString(2)
}
fun main() {
    val a = "1010"
    val b = "1101"
    val sum = addBinary(a, b)
    println(sum) 
}