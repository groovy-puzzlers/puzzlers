/**
 * Submitted by: Alonso Torres alonso.torres@kaleidos.net
 * 
 * @author Noam Y. Tenne
 */


boolean test(int x) {
    return
    x == 1 ||
            x == 2 ||
            x == 3
}

println test(1) // prints false!

//The problem it's the end of line and the primitive boolean type (that can only be true/false)

Boolean testB(int x) {
    return
    x == 1 ||
            x == 2 ||
            x == 3
}

println test(1) // at least prints null but still wrong :(

//And this one is OK:

boolean testC(int x) {
    return x == 1 ||
            x == 2 ||
            x == 3
}

println test(1)
