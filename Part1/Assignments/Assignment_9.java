package Assignments;
import java.util.*;
public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to input your marks or 0 to exit0");
        int n = sc.nextInt();
        do{
            System.out.println("Enter your marks now!");
            int marks = sc.nextInt();
            if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else {
                System.out.println("This is Good");
            }
            n = marks;
        } while( n != 0);
    }
}
