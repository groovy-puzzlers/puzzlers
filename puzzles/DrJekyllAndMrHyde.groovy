//https://plus.google.com/+CharlieHubbard/posts

class MrHyde {
    def me() {
        return this
    }
}

class DrJekyll {
}

DrJekyll.mixin MrHyde

def drJekyll = new DrJekyll().me() as DrJekyll

def mrHide = new DrJekyll().me()
println "$drJekyll and $mrHide, are they the same? ${(drJekyll.class).equals(mrHide.class)}"


//println(drJekyll.equals(mrHide))
//println(().equals(mrHide.class))
//println((drJekyll.metaClass).equals(mrHide.metaClass))