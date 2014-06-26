
/**
 * The missing lyrics
 *
 * @author Noam Y. Tenne
 */

class VanHalen {

    public static jump() {
        "Here are the ${lyrics()}"
    }

    def methodMissing(String name, def args) {
        'lyrics'
    }
}

println VanHalen.jump()