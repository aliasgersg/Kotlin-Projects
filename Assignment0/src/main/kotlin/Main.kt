import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Create variables to store instances of each class
    var shape1: Shape? = null
    var shape2: Shape? = null
    var shape3: Shape? = null
    var shape4: Shape? = null

    // Prompt the user to enter dimensions for each object
    println("Enter dimensions for each shape:")

    print("Enter the name for Square: ")
    val squareName = scanner.next()
    print("Enter the length for Square: ")
    val squareLength = scanner.nextDouble()
    print("Enter the height for Square: ")
    val squareHeight = scanner.nextDouble()
    shape1 = Square(squareName, squareLength, squareHeight)

    print("Enter the name for Circle: ")
    val circleName = scanner.next()
    print("Enter the radius for Circle: ")
    val circleRadius = scanner.nextDouble()
    shape2 = Circle(circleName, circleRadius)

    print("Enter the name for Triangle: ")
    val triangleName = scanner.next()
    print("Enter the length of Side 1 for Triangle: ")
    val triangleSide1 = scanner.nextDouble()
    print("Enter the length of Side 2 for Triangle: ")
    val triangleSide2 = scanner.nextDouble()
    print("Enter the length of Side 3 for Triangle: ")
    val triangleSide3 = scanner.nextDouble()
    shape3 = Triangle(triangleName, triangleSide1, triangleSide2, triangleSide3)

    print("Enter the name for Equilateral Triangle: ")
    val equilateralTriangleName = scanner.next()
    print("Enter the length of Side for Equilateral Triangle: ")
    val equilateralTriangleSide = scanner.nextDouble()
    shape4 = EquilateralTriangle(equilateralTriangleName, equilateralTriangleSide)

    // Print the name, dimensions, and area for each object
    println("\nShapes and their details:")
    val shapes = listOf(shape1, shape2, shape3, shape4)
    for (shape in shapes) {
        println("Name: ${shape.name}")
        shape.printDimensions() // interface called here
        println("Area: ${shape.getArea()}\n")
    }

    scanner.close()
}
