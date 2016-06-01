/**
 * Created by noam (joewolf@gmail.com).
 */

// Takeaway: don't be lazy when calling single arg constructors, and don't always heed John McCarthy's advice

String stringify(String... arg) {
    def (a) = arg
    "$a"
}

println stringify()

/**
 * 1) (empty string)
 * 2) NullPointerException
 * 3) ArrayIndexOutOfBoundsException
 * 4) []
 */