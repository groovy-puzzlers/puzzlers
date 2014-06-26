/**
 * Submitted by Diego Toharia (diego@toharia.com)
 *
 * @author Noam Y. Tenne
 */

// First

Closure<Integer> produceRandomGenerator() {
    {
        new Random().nextInt()
    }
}

println produceRandomGenerator()()
/*
 * A - NullPointerException
 * B - produceRandomGenerator_closure1@xxxxxxx
 * C - cannot startup
 * D - a random integer
 */


// Second

Closure<Integer> produceRandomGenerator() {
    return
    { ->
        new Random().nextInt()
    }
}

println produceRandomGenerator()()
/*
 * A - NullPointerException
 * B - produceRandomGenerator_closure1@xxxxxxx
 * C - cannot startup
 * D - a random integer
 */