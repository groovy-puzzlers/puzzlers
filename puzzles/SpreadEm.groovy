/**
 * Created by noam (gunchin@programpark.ru)
 */

def list = ['hey', 'joe']
def arr = ['hey', 'jude'] as Object[]

def m(a, b) {
    println "$a $b"
}

m(arr)
m(list)
m(*list)
m(*arr)

/**
 * 1) hey jude, hey joe, hey joe, hey jude
 * 2) [hey, jude] null, [hey, joe] null, hey joe, hey jude
 * 3) MissingMethodException
 * 4) [hey, jude] null, [hey, joe] null, [hey, jude] null, [hey, joe] null
 */