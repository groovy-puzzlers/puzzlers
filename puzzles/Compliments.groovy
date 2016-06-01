/**
 * Created by noam (@bsideup)
 */

def a = ["great", "nice", "fun"]
println a.collect { hit -> "Scala is $hit" }.toArray(new String[0])

/*
1) MissingPropertyException: No such property: hit for class: Compliments
2) [Scala is great, Scala is nice, Scala is fun]
3) ArrayStoreException
4) [java.lang.Object@52bf72b5, java.lang.Object@37afeb11, java.lang.Object@515aebb0, java.lang.Object@dd8ba08, java.lang.Object@245b4bdc, java.lang.Object@6c64cb25]
*/