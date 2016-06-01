/**
 * The missing lyrics
 *
 * @author Noam Y. Tenne
 */

class VanHalen {

    public static jump() {
        "Here are the ${lyrics()}"
    }

    static $static_methodMissing(String name, def args) {
        'lyrics'
    }
}

println VanHalen.jump()
