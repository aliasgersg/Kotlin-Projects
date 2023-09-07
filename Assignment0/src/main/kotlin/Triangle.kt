import kotlin.math.sqrt
open class Triangle (name: String, private var side1: Double, private var side2: Double, private var side3: Double) : Shape(name) {

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    override fun printDimensions() {
        println("Name: $name, Side1: $side1, Side2: $side2, Side3: $side3")
    }

}