/**
 * Max Power
 *
 * @author Noam Y. Tenne
 */

List<Integer> list = [56, '9', 74]
def max = list.max { item ->
    (item < 50) ? item : null
}
println max