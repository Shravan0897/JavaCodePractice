package Assignments;

public class Assignment_6 {
    public static void main(String[] args) {
        //printing even number using only for loop.
        for(int num = 0; num <= 20; num+=2){
            System.out.println("number:"+num);
        }
        //printing even number using both for & if loop.
        for(int number =0; number <= 50; number++){
            if (number % 2 == 0) {
                System.out.println("number:"+number);
            }
        }
    }
}
