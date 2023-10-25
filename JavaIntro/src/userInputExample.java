import java.util.Scanner;

public class userInputExample {

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

        // String input
        String name = scanner.nextLine();

        // Numerical input
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

}
