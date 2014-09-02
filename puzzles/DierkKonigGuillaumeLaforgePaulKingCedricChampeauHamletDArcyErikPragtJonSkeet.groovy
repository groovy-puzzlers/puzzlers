import org.codehaus.groovy.groovydoc.GroovyDoc as delegate

def delegate = new Ghostwriter()

println ({ ->
    delegate.class
}.call())

class Ghostwriter {
    String book = 'Groovy in Action, 2nd Edition'
}


//A: DierkKonigGuillaumeLaforgePaulKingCedricChampeauHamletDArcyErikPragtJonSkeet
//B: org.codehaus.groovy.groovydoc.GroovyDoc
//C: Ghostwriter
//D: Startup error