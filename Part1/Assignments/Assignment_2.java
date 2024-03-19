package Assignments;
import java.util.*;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num+" is a even number.");
        } else{
            System.out.println(num+" is odd number.");
        }
    }
}
