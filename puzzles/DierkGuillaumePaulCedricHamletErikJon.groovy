import org.codehaus.groovy.tools.groovydoc.SimpleGroovyDoc as delegate

def delegate = new Ghostwriter()

println ({ ->
    delegate.class.simpleName
}.call())

class Ghostwriter {
    String book = '****** in Action, *** Edition'
}


//A: DierkGuillaumePaulCedricHamletErikJon
//B: org.codehaus.groovy.groovydoc.GroovyDoc
//C: Ghostwriter
//D: Startup error