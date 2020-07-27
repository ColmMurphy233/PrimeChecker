class CheckAllNumbers {
    companion object {
        fun printAllPrimes(startNum: Int) {
            var NUMBER: Int = startNum
            while (NUMBER <= Int.MAX_VALUE) {
                if (isPrime(NUMBER)) {
                    println("${NUMBER}, ${isPrime(NUMBER)}")
                }
                ++NUMBER
            }
        }


        fun isPrime(num: Int): Boolean {
            for (i in 2 until num) {
                if (num % i == 0) {
                    return false
                }
            }
            return true
        }
    }

}