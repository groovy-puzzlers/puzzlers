/**
 * Created by noam on 4/7/16.
 */

import groovy.transform.*

@CompileStatic
Map<String, ?> makeMap() {
    def map = [string: "string"]
    map.number = 1
    return map
}

def map = makeMap()
map.each { println it.value.getClass().name }