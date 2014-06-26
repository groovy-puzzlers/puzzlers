/**
 * Out of range
 *
 * @author Noam Y. Tenne
 */

def range = 1.0..10.0
assert range.contains(5.0)
println range.contains(5.6)