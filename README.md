# 🧮 Java Calculator - Task 1

This project is a simple **command-line calculator** written in Java.  
It allows users to perform **Addition, Subtraction, Multiplication, and Division** on two integers repeatedly until they choose to exit.  
This task demonstrates **basic Java programming concepts** like loops, methods, and switch-case statements.

---

---

## 🚀 Features

- ✅ Addition of two integers  
- ✅ Subtraction of two integers  
- ✅ Multiplication of two integers  
- ✅ Division of two integers  
- ✅ Menu-driven program with looping  
- ✅ Exit option to safely terminate  
- ✅ Handles invalid inputs with error message  

---

## 🛠️ Technologies Used

- **Language: Java  
- **JDK Version:** 8 or above  
- **IDE: Eclipse  

---

## 📝 Code Overview

- Uses `Scanner` to take user input.
- Runs in a continuous `while(true)` loop until "Exit" is chosen.
- Implements a **switch-case** for different operations.
- Separate static methods:
  - addition(int a, int b)
  - subtraction(int a, int b)
  - multiplication(int a, int b)
  - division(int a, int b)
- Prints "Invalid input" if an unsupported option is entered.
- Uses "System.exit(0)" to terminate.

---

## 🔑 Program Flow

1. The program asks for two integer inputs.
2. Displays a menu of operations.
3. Performs the selected operation using the respective method.
4. Loops back to the menu until **Exit (5)** is chosen.
5. Prints results in the console.

---

## 💻 How to Run the Program

### 1️⃣ Clone the repository
```bash
git clone https://github.com/naveen84422/Calculator-Task-1.git
```

### 2️⃣ Navigate to the project folder
```bash
cd Calculator-Task-1
```

### 3️⃣ Compile the Java program
```bash
javac Calculator.java
```

### 4️⃣ Run the program
```bash
java Calculator
```

---

## 🧑‍💻 Sample Output

```
Enter first number: 10
Enter second number: 5

1 addition
2 subtraction
3 multiplication
4 division
5 exit
Enter your choice: 1
Result: 15

Enter your choice: 3
Result: 50

Enter your choice: 4
Result: 2

Enter your choice: 5
Exiting...
```

---

## ⚠️ Notes

- Division is **integer division**, meaning results will not have decimals.
- Make sure the second number is not zero when performing division to avoid errors.
- For floating-point calculations, modify the program to use `double` instead of `int`.

---

## 📄 License

This project is **open-source** and available under the [MIT License](LICENSE).

---

## 👤 Author

- **Naveen Kumar Amudala**  
- [GitHub](https://github.com/naveen84422)  
- [LinkedIn](https://www.linkedin.com/in/naveen-kumar-amudala)

---

## ⭐ Contribute

Feel free to **fork** this repository, make improvements, and create a **pull request**.  
Suggestions and contributions are always welcome!

---

## ✅ Future Improvements

- Add **modulus operation**  
- Support **floating-point arithmetic**  
- Implement **GUI version** of the calculator  
