package Assignments;
import java.util.*;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a+" is equal to "+b);
        } else if (a > b) {
            System.out.println(a+" is greater than "+b);
        } else{
            System.out.println(a+" is less than "+b);
        }
        sc.close();
    }
}
