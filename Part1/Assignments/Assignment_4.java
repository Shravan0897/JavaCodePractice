package Assignments;
import java.util.*;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter 1 for addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 for remainder");
        int calc = sc.nextInt();
        switch (calc) {
            case 1: System.out.println(a+b);
                break;
            case 2: System.out.println(a-b);
                break;
            case 3: System.out.println(a*b);
                break;
            case 4: if (b == 0) {
                System.out.println("Inavalid division");
            } else {
                System.out.println(a/b);
            }
                break;
            case 5: if (b == 0) {
                System.out.println("Invalid division");
            } else {
                System.out.println(a%b);
            }
                break;
            default: System.out.println("Number do not exist!");
        }
    }
}
