class MrHide {
    def me() {
        return this
    }
}

class DrJekyl {
}

DrJekyl.mixin MrHide

def drJekyl = new DrJekyl().me() as DrJekyl

def mrHide = new DrJekyl().me()
println "$drJekyl and $mrHide, are they the same? ${(drJekyl.class).equals(mrHide.class)}"


//println(drJekyl.equals(mrHide))
//println(().equals(mrHide.class))
//println((drJekyl.metaClass).equals(mrHide.metaClass))