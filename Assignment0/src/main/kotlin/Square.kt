class Square (name: String, private var length : Double, private var height : Double) : Shape(name) {


    override fun getArea(): Double {
        return length * height
    }

    override fun printDimensions() {
        println("Name: $name, Length: $length, Height: $height")
    }

}