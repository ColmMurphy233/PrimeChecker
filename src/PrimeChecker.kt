import kotlin.system.exitProcess

fun main() {
    PrimeChecker.main()
}

class PrimeChecker {
    /**
     * a program to cycle through integers to and prints whether or not they are prime
     */
    companion object {
        fun main() {
            println(
                "a: Check if one number is prime \n" +
                        "b: Cycle through all integers and print the ones that are prime \n" +
                        "e: exit"
            )
            when (readLine()!!.toLowerCase()) {
                "a" -> {
                    println("Enter a number to check:")
                    println(CheckAllNumbers.isPrime(readLine()!!.toInt()))
                    main()
                }
                "b" -> {
                    println("Enter a number to start at:")
                    CheckAllNumbers.printAllPrimes(readLine()!!.toInt())
                }
                "e" -> exitProcess(0)
            }
        }
    }

}
