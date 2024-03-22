package Assignments;
import java.util.*;
public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Print it's Table");
        int n = sc.nextInt();
        int i = 1;
        int mult = 0;
        while (i <= 10) {
            mult = n * i;
            System.out.println(n+"x"+i+"="+mult);
            i++;
        }
    }
}
