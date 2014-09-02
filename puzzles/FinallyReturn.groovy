/**
 * Submitted by Iván López lopez.ivan@gmail.com
 * 
 * @author Noam Y. Tenne
 */

class CountDown { int counter = 10 }

CountDown finalCountDown() {
    def countDown = new CountDown()
    try {
        countDown.counter = --countDown.counter
    } catch (ignored) {
        println "That will never happen."
        countDown.counter = Integer.MIN_VALUE
    } finally {
        return countDown
    }
    42
}

println finalCountDown().counter


//FIX

CountDown finalCountDownFix() {
    def countDown = new CountDown()
    try {
        countDown.counter = --countDown.counter
    } catch (ignored) {
        println "That will never happen."
        countDown.counter = Integer.MIN_VALUE
    } finally {
        return countDown
    }
    42
}

println finalCountDownFix().counter