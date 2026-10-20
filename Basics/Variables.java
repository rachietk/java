
public class Variables {

    // 1. Instance variable: belongs to each object
    int rollNumber = 101;

    // 2. Static variable: shared by the class
    static String college = "IET Lucknow";

    public static void main(String[] args) {

        // 3. Local variables: declared inside a method
        int totalMarks = 20;
        int obtainedMarks = 16;

        // 4. Primitive data types in Java
        byte age = 20;                  // Small whole number
        short year = 2026;              // Whole number
        int salary = 15000;             // Integer
        long population = 8000000L;     // Large integer

        float percentage = 80.5f;       // Decimal number
        double pi = 3.14159;            // Decimal with more precision

        char grade = 'A';               // Single character
        boolean passed = true;          // True or false

        // 5. Reference type: String stores text
        String name = "Student";

        // 6. Declaration: creating a variable
        int number;

        // Initialization: assigning its first value
        number = 10;

        // 7. Reassignment: changing the value
        number = 25;

        // 8. Constant: final prevents reassignment
        final double GST_RATE = 0.18;

        // 9. Arithmetic operators
        int sum = 10 + 20;          // Addition = 30
        int difference = 20 - 10;   // Subtraction = 10
        int product = 5 * 4;        // Multiplication = 20
        int quotient = 20 / 4;      // Division = 5
        int remainder = 10 % 3;     // Remainder = 1

        // 10. Printing values using println()
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);

        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);

        System.out.println("Percentage: " + percentage);
        System.out.println("PI: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        System.out.println("Number after reassignment: " + number);
        System.out.println("GST Rate: " + GST_RATE);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // 11. Creating an object to access instance variable
        Variables obj = new Variables();
        System.out.println("Roll Number: " + obj.rollNumber);

        // 12. Small exercise: calculate total and average
        int subject1 = 70;
        int subject2 = 80;
        int subject3 = 90;

        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Exercise Total: " + total);
        System.out.println("Exercise Average: " + average);
    }
}
