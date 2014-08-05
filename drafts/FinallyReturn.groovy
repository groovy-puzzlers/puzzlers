/**
 * Submitted by Iván López lopez.ivan@gmail.com
 * 
 * @author Noam Y. Tenne
 */

class A { Boolean hasFailed }
class B { String msg }

B doSomething(A a) {
    def b = new B()
    try {
        b.msg = a.hasFailed ? 'error' : 'no error'
    } catch (e) {
        println e
        b.msg = 'exception'
    } finally {
        return b
    }
}

def a = new A(hasFailed: true)
println doSomething(a).msg

/**
At first sight it seems pretty obvious that the code is going to print "error". What really happens it that it throws a GroovyCastException. The problem is that Groovy tries to return the 'error' String in the try block instead of call the finally method and return the b object.
        If we add, for example, a println before the catch, it behaves correctly:

*/
try {
    b.msg = a.hasFailed ? 'error' : 'no error'
    println "something"
} catch (e) {
}


 /**
* It also behaves correctly if we add an statement after the try-catch-finally block
  */
try {

} finally {
    return b
}
2+3 // Any valid statement

