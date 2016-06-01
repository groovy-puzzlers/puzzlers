/**
 * Created by noam (joewolf@gmail.com).
 */

String stringify(String arg) {
    def (a) = arg
    "$a"
}

println stringify()

/**
 * 1) (empty string)
 * 2) NullPointerException
 * 3) 'null'
 * 4) null
 */