/**
 * Submitted by Diego Toharia (diego@toharia.com)
 *
 * @author Noam Y. Tenne
 */

// First

Closure<Integer> whodunit() {
    {
        'The butler did it.'
    }
}

println whodunit()()
/*
 * A - NullPointerException
 * B - whodunitI_closure1@xxxxxxx
 * C - cannot startup
 * D - The butler did it.
 */

// Fix

Closure<Integer> whodunitFix() {
    { ->
        'The butler did it.'
    }
}

println whodunitFix()()
