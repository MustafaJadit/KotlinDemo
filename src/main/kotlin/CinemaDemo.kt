fun main() {
    // write your code here
    println("Cinema:")
    for (i in (1..8)) {
        for (j in 0..8) {
            if (i == 1) {
                if (j == 0) {
                    print(" ")
                } else if (j < 8) {
                    print(" $j")
                } else {
                    println(" $j")
                }

            } else {
                if (j == 0) {
                    print(i-1)
                } else if (j < 8) {
                    print(" S")
                } else {
                    println(" S")
                }
            }

        }

    }

}