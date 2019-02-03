package enum_class

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    BLUE(0, 0, 255);

    fun color() = (r * 256 + g) * 256 + b
}