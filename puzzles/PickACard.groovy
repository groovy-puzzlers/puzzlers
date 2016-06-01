import java.util.regex.Matcher

/**
 * (Use gambit)
 * Created by noam (@Jimbo1167)
 */

class CaptainSelector { }

def pick(prefix, selector=null, ship=null) {
    println "${prefix}James T. Kirk"
}

def pick(prefix, CaptainSelector cs, ship=null) {
    println "${prefix}Jean-Luc Picard"
}

pick("The captain is ", null, null)

def a(prefix, List l) {
    println "undef type"
}

def a(prefix, Class m) {
    println "collection"
}

a("wtf",null)


/**
 * 1) The captain is James T. Kirk
 * 2) The captain is Jean-Luc Picard
 * 3) Method not found
 * 4) Compilation Error - Duplicate Methods
 */