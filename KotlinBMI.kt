fun calculateBMI(weight: Double, height: Double): Double {
    return weight / (height * height)
}

fun main() {
    print("Enter your weight in kilograms: ")
    val weight = readLine()?.toDoubleOrNull() ?: return

    print("Enter your height in meters: ")
    val height = readLine()?.toDoubleOrNull() ?: return

    val bmi = calculateBMI(weight, height)
    println("Your BMI is: %.2f".format(bmi))

    // Check BMI category
    when {
        bmi < 18.5 -> println("You are underweight.")
        bmi in 18.5..24.9 -> println("You have a normal weight.")
        bmi in 25.0..29.9 -> println("You are overweight.")
        else -> println("You are obese.")
    }
}
