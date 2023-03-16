fun notContains(array: IntArray): Int {
    val positiveArray = array.filter { it > 0 }
    
    // Sort the array in ascending order
    val sortedArray = positiveArray.sorted()
    if (sortedArray.isEmpty() || sortedArray[0] != 1) {
        return 1
    }
    for (i in 0 until sortedArray.size - 1) {
        if (sortedArray[i+1] - sortedArray[i] > 1) {
            return sortedArray[i] + 1
        }
    }
    return sortedArray.last() + 1
}
