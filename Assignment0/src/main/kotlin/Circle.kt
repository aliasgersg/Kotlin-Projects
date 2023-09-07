class Circle (name: String, private var radius: Double) : Shape(name) {

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun printDimensions() {
        println("Name: $name, Radius: $radius")
    }

}