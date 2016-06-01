/**
 * Created by noam (vladimir@orany.cz)
 */

Map<String, Integer> map = [:]

(3..1).each {
    map.put "${it.toInteger()}", it
}

for (def key in map.keySet().collect{ "${it}".values.first() }) {
    println map.get(key)
}
println "We have lift off!"

/**
 * 1) 3, 2, 1 We have lift off!
 * 2) 1, 2, 3 We have lift off!
 * 3) null, null, null We have lift off!
 * 4) MissingPropertyException
 */