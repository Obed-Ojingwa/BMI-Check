# BMI Calculator in Kotlin

This is a simple command-line Body Mass Index (BMI) calculator written in Kotlin. The program calculates the BMI based on the user's weight (in kilograms) and height (in meters) and categorizes it into underweight, normal weight, overweight, or obese.

## Features

- Takes user input for weight and height.
- Calculates the BMI using the formula:  
  \[
  \text{BMI} = \frac{\text{weight}}{\text{height}^2}
  \]
- Displays the user's BMI with two decimal precision.
- Provides a category based on the BMI result:
  - Underweight: BMI < 18.5
  - Normal weight: 18.5 ≤ BMI < 24.9
  - Overweight: 25.0 ≤ BMI < 29.9
  - Obese: BMI ≥ 30

## Getting Started

### Prerequisites

- You need to have Kotlin installed on your system.
- A Kotlin-compatible IDE or a text editor and terminal to run the program.

### Installation

1. Clone or download this repository to your local machine.
2. Open the project folder in your preferred Kotlin IDE (e.g., IntelliJ IDEA) or text editor.

### Running the Program

To run the program, follow these steps:

1. Open a terminal or use the built-in terminal in your IDE.
2. Navigate to the project directory.
3. Compile the program using the Kotlin compiler:

   ```bash
   kotlinc BMI.kt -include-runtime -d BMI.jar
