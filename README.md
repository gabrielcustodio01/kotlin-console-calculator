🧮 Kotlin Console Calculator

A simple console-based calculator written in Kotlin.
The program allows the user to perform the four basic math operations:

➕ Addition

➖ Subtraction

✖ Multiplication

➗ Division

The application includes input validation and allows the user to exit at any time by typing q.

📁 About the Project

This project demonstrates:

Kotlin classes and functions

Clean separation between logic (Calculator) and input validation (InputChecker)

Use of loops and conditionals

Interaction via console (CLI)

Execution of Kotlin applications in IntelliJ IDEA

This project was tested and executed using IntelliJ IDEA.

🧰 Requirements

Before running this project, make sure you have:

JDK 8 or higher

IntelliJ IDEA (Community or Ultimate)

Kotlin plugin (usually already included)

▶ How to Run the Project (IntelliJ IDEA)

Open IntelliJ IDEA

Go to File → New → Project

Select Kotlin → Kotlin/JVM

Create the project

Inside the src folder, create a new file named Main.kt

Paste the program code into the file

Click the Run ▶ button next to the main function

The console will open, and the calculator will start running

🧑‍💻 How It Works

When the program starts, you will see a menu like this:

Select the operation:

1) Add
2) Subtract
3) Multiply
4) Divide
q) Quit


Steps:

Choose an operation (1–4)

Enter the first number

Enter the second number

The result will be displayed in the console

You can type q at any moment to exit the program.

📂 Project Structure
├── Calculator
│   ├── execute()   → Runs the selected operation
│   ├── add()
│   ├── subtract()
│   ├── multiply()
│   └── divide()
│
├── InputChecker
│   ├── isOperation()   → Validates menu input
│   ├── isNumber()      → Validates numeric input
│   └── isQuitCommand() → Checks for the quit command
│
└── main()              → Handles program flow and console interaction

🧪 Example Run
Select the operation:

1) Add
2) Subtract
3) Multiply
4) Divide
q) Quit
1
Type the first number or type 'q' to exit:
10
Type the second number or type 'q' to exit:
5
15.0
